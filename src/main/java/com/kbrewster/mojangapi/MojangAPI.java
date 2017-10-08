package com.kbrewster.mojangapi;

import com.google.gson.*;
import com.kbrewster.hypixelapi.exceptions.APIException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Allows access to the MojangAPI
 * http://wiki.vg/Mojang_API
 */
public class MojangAPI {

    private final static String BASE_URL = "https://api.mojang.com";
    private final static String STATUS_URL = "https://status.mojang.com/check";

    /**
     * Gets Mojang's status
     * @return
     * @throws IOException
     */
    public static Map<String, String> getStatus() throws IOException {
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
     * Gets Players UUID
     * @param username
     * @return UUID of the player
     * @throws IOException
     */
    public static String getUUIDByUsername(String username) throws IOException {
        String json = sendGet("https://api.mojang.com/users/profiles/minecraft/TheDestinyPig");
        JsonObject obj = new JsonParser().parse(json).getAsJsonObject();
        if(obj.get("error") instanceof JsonNull)
            throw new APIException(obj.get("errorMessage").getAsString());
        return obj.get("id").getAsString();
    }

    /**
     * TODO: http://wiki.vg/Mojang_API
     * @return
     * @throws IOException
     */
    private Profile getProfile() throws IOException {
        return null;
    }

    /**
     * Gets HTTP response
     * @return
     */
    private static ResponseHandler<String> responseHandler() {
        return response -> {
            int status = response.getStatusLine().getStatusCode();
            if (status >= 200 && status < 300) {
                HttpEntity entity = response.getEntity();
                return entity != null ? EntityUtils.toString(entity) : null;
            } else {
                throw new ClientProtocolException("Unexpected response status: " + status);
            }
        };
    }

    /**
     * Sends GET request
     * @param url
     * @return
     * @throws IOException
     */
    private static String sendGet(String url) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpget = new HttpGet(url);
            httpget.setHeader("Content-Type", "application/json");
            ResponseHandler<String> responseHandler = responseHandler();
            String responseBody = httpclient.execute(httpget, responseHandler);
            return responseBody;
        }
    }

    /**
     * Sends POST request
     * @param url
     * @return
     * @throws IOException
     */
    private static String sendPost(String url) throws IOException {

        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(url);
            return httpclient.execute(httpPost, responseHandler());
        }
    }
}
