package com.kbrewster.hypixelapi;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kbrewster.API;
import com.kbrewster.hypixelapi.exceptions.APIException;
import com.kbrewster.hypixelapi.exceptions.InvalidGuildException;
import com.kbrewster.hypixelapi.exceptions.InvalidPlayerException;
import com.kbrewster.hypixelapi.guild.Guild;
import com.kbrewster.hypixelapi.key.APIKey;
import com.kbrewster.hypixelapi.player.Player;
import com.kbrewster.mojangapi.MojangAPI;

import java.io.IOException;

/**
 * Allows to access to the Hypixel API
 * https://api.hypixel.net/
 */
@API.Reference(apiName = "Hypixel API", apiVersion = "1.1.1")
public class HypixelAPI extends API {

    /**
     * API's URL
     */
    private final String BASE_URL = "https://api.hypixel.net";

    /**
     * For some reason Hypixel does not accept application requests
     */
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
        JsonObject json = readJsonUrl(url);
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
        JsonObject json = readJsonUrl(url);
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
    public String getGuildID(String name) throws IOException, APIException {
        String uuid = MojangAPI.getUUID(name);
        return getGuildIDByUUID(uuid);
    }

    /**
     * Parses Guild Information into an instance of 'Guild'
     * @param guildID
     * @return
     * @throws IOException
     */
    public Guild getGuild(String guildID) throws IOException, APIException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/guild?key=%s&id=%s", key, guildID);
        JsonObject json = readJsonUrl(url);
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
    public String getGuildIDByUUID(String uuid) throws IOException, APIException {
        String url = String.format(BASE_URL + "/findGuild?byUuid=%s&key=%s", uuid, key);
        JsonObject json = readJsonUrl(url);
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        return json.get("guild").getAsString();
    }

    public APIKey getKeyInfo() throws IOException, APIException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/key?key=%s", key);
        JsonObject json = readJsonUrl(url);
        if (!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement record = json.get("record");
        if (record.isJsonNull())
            throw new APIException("No record found!");
        return gson.fromJson(record, APIKey.class);
    }

    /**
     * Reads URL
     * @param url
     * @return
     */
    private JsonObject readJsonUrl(String url) throws IOException {
        JsonElement jElement = new JsonParser().parse(sendGet(url, USER_AGENT));
        return jElement.getAsJsonObject();
    }
}
