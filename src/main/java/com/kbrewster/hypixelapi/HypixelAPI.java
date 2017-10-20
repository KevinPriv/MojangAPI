package com.kbrewster.hypixelapi;

import com.google.gson.*;
import com.kbrewster.hypixelapi.exceptions.APIException;
import com.kbrewster.hypixelapi.exceptions.InvalidGuildException;
import com.kbrewster.hypixelapi.exceptions.InvalidPlayerException;
import com.kbrewster.hypixelapi.guild.Guild;
import com.kbrewster.hypixelapi.player.Player;
import com.kbrewster.mojangapi.MojangAPI;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Allows to access to the Hypixel API
 * https://api.hypixel.net/
 */
public class HypixelAPI {

    private final String BASE_URL = "https://api.hypixel.net";
    private final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36";

    private String key;

    /**
     * Creates an instance of HypixelAPI
     * @param key Hypixel API key gotten from using /api ingame
     */
    public HypixelAPI(String key) {
        this.key = key;
    }

    /**
     * Gets [name]'s Hypixel player information
     * @param name The player you want to get the information of
     * @throws APIException API Key is invalid
     * @throws InvalidPlayerException Player Name does not exist
     * @throws IOException Error reading json
     */
    public Player getPlayer(String name) throws APIException, InvalidPlayerException, IOException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/player?name=%s&key=%s", name, key);
        JsonObject json = readJsonUrl(new URL(url));
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement player = json.get("player");
        if (player.isJsonNull())
            throw new InvalidPlayerException();
        return gson.fromJson(player, Player.class);
    }

    /**
     * Gets [name]'s Hypixel player information
     * @param uuid The player you want to get the information of
     * @throws APIException API Key is invalid
     * @throws InvalidPlayerException Player Name does not exist
     * @throws IOException Error reading json
     */
    public Player getPlayerByUuid(String uuid) throws APIException, InvalidPlayerException, IOException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/player?uuid=%s&key=%s", uuid, key);
        JsonObject json = readJsonUrl(new URL(url));
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement player = json.get("player");
        if (player.isJsonNull())
            throw new InvalidPlayerException();
        return gson.fromJson(player, Player.class);
    }

    /**
     * Gets Guild ID
     * @param name
     * @return
     * @throws IOException
     */
    public String getGuildID(String name) throws IOException {
        String uuid = MojangAPI.getUUIDByUsername(name);
        return getGuildIDByUUID(uuid);
    }

    /**
     * Parses Guild Information into an instance of 'Guild'
     * @param guildID
     * @return
     * @throws IOException
     */
    public Guild getGuild(String guildID) throws IOException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/guild?key=%s&id=%s", key, guildID);
        JsonObject json = readJsonUrl(new URL(url));
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement guild = json.get("guild");
        if (guild.isJsonNull())
            throw new InvalidGuildException();
        return gson.fromJson(guild, Guild.class);
    }

    /**
     * Gets Guild ID by UUID
     * @param uuid
     * @return
     * @throws IOException
     */
    public String getGuildIDByUUID(String uuid) throws IOException {
        String url = String.format(BASE_URL + "/findGuild?byUuid=%s&key=%s", uuid, key);
        JsonObject json = readUrl(url);
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        return json.get("guild").getAsString();
    }

    /**
     * Reads JSON from a URL
     * @param url URL request is sent to
     * @return JsonObject
     * @throws IOException
     */
    private JsonObject readJsonUrl(URL url) throws IOException {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestProperty("User-Agent", USER_AGENT);
        request.connect();
        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement parsedInputStream = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        return parsedInputStream.getAsJsonObject();
    }

    /**
     * Reads URL
     * @param url
     * @return
     */
    private static JsonObject readUrl(String url) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpget = new HttpGet(url);
            System.out.println("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            JsonElement jelement = new JsonParser().parse(responseBody);
            return jelement.getAsJsonObject();
        }
    }
}
