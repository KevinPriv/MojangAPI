package com.kbrewster;

import lombok.Getter;
import okhttp3.*;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * API Commons
 */
@API.Reference(apiName = "API", apiVersion = "1.1.2")
public abstract class API {

    @Getter
    private static String apiName = API.class.getAnnotation(Reference.class).apiName();

    @Getter
    private static String apiVersion = API.class.getAnnotation(Reference.class).apiVersion();

    private static OkHttpClient client = new OkHttpClient();

    /**
     * Sends GET request
     *
     * @param url
     * @param contentType
     * @return
     * @throws IOException
     */
    protected static String sendGet(String url, String contentType) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .header("User-Agent", contentType)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    /**
     * Sends GET request
     *
     * @param url
     * @return
     * @throws IOException
     */
    protected static String sendGet(String url) throws IOException {
        return sendGet(url, "application/json");
    }

    /**
     * Sends POST request
     *
     * @param url
     * @param contentType
     * @return
     * @throws IOException
     */
    protected static String sendPost(String url, String payload, String contentType) throws IOException {
        MediaType MEDIA_TYPE = MediaType.parse(contentType);

        RequestBody body = RequestBody.create(MEDIA_TYPE, payload);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    /**
     * Sends POST request
     *
     * @param url
     * @return
     * @throws IOException
     */
    protected static String sendPost(String url, String payload) throws IOException {
        return sendPost(url, payload, "application/json");
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Reference {

        String apiName();

        String apiVersion();
    }
}
