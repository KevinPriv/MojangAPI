package me.kbrewster.mojangapi;

import com.google.gson.*;
import me.kbrewster.API;
import me.kbrewster.exceptions.APIException;
import me.kbrewster.exceptions.InvalidPlayerException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Allows access to the MojangAPI
 * http://wiki.vg/Mojang_API
 */
@API.Reference(apiName = "Mojang API", apiVersion = "1.1.2")
public class MojangAPI extends API {

    private final static String BASE_URL = "https://api.mojang.com";
    private final static String STATUS_URL = "https://status.mojang.com/check";

    /**
     * Gets Mojang's status
     * @return
     * @throws IOException
     */
    public static Map<String, String> getStatus() throws IOException {
        // TODO: Status Data Class?
        Map<String, String> map = new TreeMap<>();
        String json = sendGet(STATUS_URL);
        JsonArray status = new JsonParser().parse(json).getAsJsonArray();
        for(JsonElement element: status) {
            JsonObject obj = element.getAsJsonObject();
            obj.entrySet().forEach(s -> map.put(s.getKey(), s.getValue().getAsString()));
        }
        return map;
    }

    /**
     * Gets players username by their uuid
     *
     * @param uuid
     * @return
     * @throws Exception
     */
    public static String getName(String uuid) throws Exception {
        ArrayList<Name> names = getNameHistoryByUUID(uuid);
        return names.get(names.size() - 1).getName();
    }

    /**
     * Gets players past names vai username
     * @param username
     * @return
     * @throws Exception
     */
    public static ArrayList<Name> getNameHistory(String username) throws Exception {
        String uuid = getUUID(username);
        System.out.println(uuid);
        return getNameHistoryByUUID(uuid);
    }

    /**
     * Gets players past names vai UUID
     *
     * @param uuid
     * @return
     * @throws Exception
     */
    public static ArrayList<Name> getNameHistoryByUUID(String uuid) throws Exception {
        Gson gson = new Gson();
        ArrayList<Name> names = new ArrayList<>();
        String json = sendGet(String.format(BASE_URL + "/user/profiles/%s/names", uuid));
        System.out.println(json);
        JsonElement parser = new JsonParser().parse(json);
        if (json.isEmpty()) throw new InvalidPlayerException();
        JsonArray arrayNames = parser.getAsJsonArray();
        arrayNames.forEach(obj -> {
            Name name = gson.fromJson(obj, Name.class);
            names.add(name);
        });
        return names;
    }

    /**
     * Gets Players UUID
     * @param username
     * @return UUID of the player
     * @throws IOException
     */
    public static String getUUID(String username) throws IOException, APIException, InvalidPlayerException {
        String json = sendGet("https://api.mojang.com/users/profiles/minecraft/" + username);
        JsonElement parse = new JsonParser().parse(json);
        if (parse.isJsonNull())
            throw new InvalidPlayerException();
        JsonObject obj = parse.getAsJsonObject();
        if(obj.get("error") instanceof JsonNull)
            throw new APIException(obj.get("errorMessage").getAsString());
        return obj.get("id").getAsString();
    }

    /**
     * TODO: http://wiki.vg/Mojang_API
     * @return
     * @throws IOException
     */
    public static MojangStatistics getStatistics(MetricKeys key) throws IOException {
        String json = sendPost("https://api.mojang.com/orders/statistics", "{\"metricKeys\": [\"" + key.getKey() + "\"]}");
        JsonElement obj = new JsonParser().parse(json);
        return new Gson().fromJson(obj, MojangStatistics.class);
    }

    /**
     * TODO: http://wiki.vg/Mojang_API
     * @return
     * @throws IOException
     */
    private static Profile getProfile() throws IOException {
        return null;
    }

}
