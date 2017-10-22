package com.kbrewster;

import lombok.Getter;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

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

    /**
     * Gets HTTP response
     *
     * @return
     */
    protected static ResponseHandler<String> responseHandler() {
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
     *
     * @param url
     * @param contentType
     * @return
     * @throws IOException
     */
    protected static String sendGet(String url, String contentType) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpget = new HttpGet(url);
            httpget.setHeader("Content-Type", contentType);
            return httpclient.execute(httpget, responseHandler());
        }
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
     * Sends PUT request
     *
     * @param url
     * @param contentType
     * @return
     * @throws IOException
     */
    protected static String sendPut(String url, String contentType) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPut httpPut = new HttpPut(url);
            httpPut.setHeader("Content-Type", contentType);
            return httpclient.execute(httpPut, responseHandler());
        }
    }

    /**
     * Sends PUT request
     *
     * @param url
     * @return
     * @throws IOException
     */
    protected static String sendPut(String url) throws IOException {
        return sendPut(url, "application/json");
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
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new StringEntity(payload, "UTF8"));
            httpPost.setHeader("Content-Type", contentType);
            return httpclient.execute(httpPost, responseHandler());
        }
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
