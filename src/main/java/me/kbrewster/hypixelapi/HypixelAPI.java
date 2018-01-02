package me.kbrewster.hypixelapi;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import me.kbrewster.API;
import me.kbrewster.exceptions.APIException;
import me.kbrewster.exceptions.InvalidGuildException;
import me.kbrewster.exceptions.InvalidPlayerException;
import me.kbrewster.hypixelapi.boosters.Booster;
import me.kbrewster.hypixelapi.friends.Friend;
import me.kbrewster.hypixelapi.guild.Guild;
import me.kbrewster.hypixelapi.key.APIKey;
import me.kbrewster.hypixelapi.leaderboards.Leaderboard;
import me.kbrewster.hypixelapi.leaderboards.Leaderboards;
import me.kbrewster.hypixelapi.player.HypixelPlayer;
import me.kbrewster.hypixelapi.session.Session;
import me.kbrewster.mojangapi.MojangAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Allows to access to the Hypixel API
 * https://api.hypixel.net/
 */
@API.Reference(apiName = "Hypixel API", apiVersion = "1.1.4")
public class HypixelAPI extends API {

    /**
     * API's URL
     */
    private final String BASE_URL = "https://api.hypixel.net";

    /**
     * For some reason Hypixel does not accept application requests
     */
    private final String USER_AGENT = getApiName() + "/v" + getApiVersion();

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
     * @throws InvalidPlayerException HypixelPlayer Name does not exist
     * @throws IOException Error reading json
     */
    public HypixelPlayer getPlayer(String name) throws APIException, InvalidPlayerException, IOException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/player?name=%s&key=%s", name, key);
        JsonObject json = readJsonUrl(url);
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement player = json.get("player");
        if (player.isJsonNull())
            throw new InvalidPlayerException();
        return gson.fromJson(player, HypixelPlayer.class);
    }

    /**
     * Gets [name]'s Hypixel player information
     * @param uuid The player you want to get the information of
     * @throws APIException API Key is invalid
     * @throws InvalidPlayerException HypixelPlayer Name does not exist
     * @throws IOException Error reading json
     */
    public HypixelPlayer getPlayer(UUID uuid) throws APIException, InvalidPlayerException, IOException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/player?uuid=%s&key=%s", uuid, key);
        JsonObject json = readJsonUrl(url);
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement player = json.get("player");
        if (player.isJsonNull())
            throw new InvalidPlayerException();
        return gson.fromJson(player, HypixelPlayer.class);
    }

    /**
     * TODO: JAVADOC
     *
     * @param name
     * @return
     * @throws APIException
     * @throws InvalidPlayerException
     * @throws IOException
     */
    public Session getSession(String name) throws APIException, IOException {
        UUID uuid = MojangAPI.getUUID(name);
        return getSession(uuid);
    }

    /**
     * TODO: JAVADOC
     *
     * @param uuid
     * @return
     * @throws APIException
     * @throws InvalidPlayerException
     * @throws IOException
     */
    public Session getSession(UUID uuid) throws APIException, IOException {
        Gson gson = new Gson();
        String url = String.format(BASE_URL + "/session?uuid=%s&key=%s", uuid, key);
        JsonObject json = readJsonUrl(url);
        if (!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement session = json.get("session");
        if (session.isJsonNull())
            throw new APIException("No session found!");
        return gson.fromJson(session, Session.class);
    }

    /**
     * TODO: JAVADOC
     *
     * @param name
     * @return
     * @throws APIException
     * @throws InvalidPlayerException
     * @throws IOException
     */
    public List<Friend> getFriends(String name) throws APIException, InvalidPlayerException, IOException {
        UUID uuid = MojangAPI.getUUID(name);
        return getFriends(uuid);
    }

    /**
     * TODO: JAVADOC
     *
     * @param uuid
     * @return
     * @throws APIException
     * @throws InvalidPlayerException
     * @throws IOException
     */
    public List<Friend> getFriends(UUID uuid) throws APIException, InvalidPlayerException, IOException {
        Gson gson = new Gson();
        ArrayList<Friend> friends = new ArrayList<>();
        String url = String.format(BASE_URL + "/friends?uuid=%s&key=%s", uuid, key);
        JsonObject json = readJsonUrl(url);
        if (!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement records = json.get("records");
        if (records.isJsonNull())
            throw new InvalidPlayerException();
        records.getAsJsonArray().forEach(jsonElement -> {
            friends.add(gson.fromJson(jsonElement, Friend.class));
        });
        return friends;
    }

    /**
     * TODO: JAVADOC
     *
     * @return
     * @throws APIException
     * @throws IOException
     */
    public List<Booster> getBoosters() throws APIException, IOException {
        Gson gson = new Gson();
        ArrayList<Booster> boosters = new ArrayList<>();
        String url = String.format(BASE_URL + "/boosters?key=%s", key);
        JsonObject json = readJsonUrl(url);
        if (!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonElement records = json.get("boosters");
        if (records.isJsonNull())
            throw new APIException("No boosters found!");
        records.getAsJsonArray().forEach(jsonElement -> {
            boosters.add(gson.fromJson(jsonElement, Booster.class));
        });
        return boosters;
    }

    /**
     * TODO: JAVADOC
     *
     * @param leaderboard
     * @return
     * @throws APIException
     * @throws IOException
     */
    public List<Leaderboard> getLeaderboard(Leaderboards leaderboard) throws APIException, IOException {
        Gson gson = new Gson();
        ArrayList<Leaderboard> leaderboards = new ArrayList<>();
        String url = String.format(BASE_URL + "/leaderboards?key=%s", key);
        JsonObject json = readJsonUrl(url);
        if (!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        JsonObject lb = json.getAsJsonObject("leaderboards");
        System.out.println(leaderboard.name());
        lb.getAsJsonArray(leaderboard.name()).forEach(element -> {
            leaderboards.add(gson.fromJson(element, Leaderboard.class));
        });

        return leaderboards;
    }



    /**
     * Gets Guild ID
     * @param name
     * @return
     * @throws IOException
     */
    public String getGuildID(String name) throws IOException, APIException {
        UUID uuid = MojangAPI.getUUID(name);
        return getGuildID(uuid);
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
    public String getGuildID(UUID uuid) throws IOException, APIException {
        String url = String.format(BASE_URL + "/findGuild?byUuid=%s&key=%s", uuid, key);
        JsonObject json = readJsonUrl(url);
        if(!json.get("success").getAsBoolean())
            throw new APIException(json.get("cause").getAsString());
        return json.get("guild").getAsString();
    }

    /**
     * TODO: JAVADOC
     * @return key info @see{APIKey}
     * @throws IOException
     * @throws APIException
     */
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
     * TODO: JAVADOC
     * @param url
     * @return
     */
    private JsonObject readJsonUrl(String url) throws IOException {
        JsonElement jElement = new JsonParser().parse(sendGet(url, USER_AGENT));
        return jElement.getAsJsonObject();
    }
}
