package com.kbrewster.hypixelapi;

import com.google.gson.*;
import com.kbrewster.hypixelapi.exceptions.InvalidApiKeyException;
import com.kbrewster.hypixelapi.exceptions.InvalidPlayerException;
import com.kbrewster.hypixelapi.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/**
 * TODO: JAVADOC
 */
public class HypixelAPI {

    private String key;

    private boolean success;

    public HypixelAPI(String key) {
        this.key = key;
    }

    /**
     * Gets [name]'s Hypixel player information
     * @param name The player you want to get the information of
     * @throws InvalidApiKeyException API Key is invalid
     * @throws InvalidPlayerException Player Name does not exist
     * @throws IOException Error reading json
     */
    public Player getPlayer(String name) throws InvalidApiKeyException, InvalidPlayerException, IOException {
        Gson gson = new Gson();
        String url = String.format("https://api.hypixel.net/player?name=%s&key=%s", name, key);
        JsonObject json = readJsonUrl(new URL(url));
        if(!json.get("success").getAsBoolean())
            if(json.get("cause").getAsString().equals("Invalid API key!")) throw new InvalidApiKeyException();
        JsonElement player = json.get("player");
        if (player.isJsonNull()) throw new InvalidPlayerException();
        return gson.fromJson(player, Player.class);
    }

    /**
     * Reads JSON from a URL
     * @param url URL request is sent to
     * @return JsonObject
     * @throws IOException
     */
    private static JsonObject readJsonUrl(URL url) throws IOException {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        request.connect();
        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement parsedInputStream = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        JsonObject jsonUrl = parsedInputStream.getAsJsonObject(); //May be an array, may be an object.
        return jsonUrl;
    }
}
