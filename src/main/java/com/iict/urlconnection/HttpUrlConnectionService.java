package com.iict.urlconnection;

import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class HttpUrlConnectionService {

    public static HttpURLConnection getHttpURLConnection(String url, String method, StringBuilder postDataBuilder, Map<String, String> requestPropertyMap) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod(method);
        connection.setReadTimeout(7000);
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        for (Map.Entry<String, String> entry : requestPropertyMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            connection.setRequestProperty(key, value);
        }
        if(postDataBuilder != null && !postDataBuilder.equals("")){
            byte[] postData = postDataBuilder.toString().getBytes("UTF-8");
            connection.getOutputStream().write(postData);
        }
        connection.connect();
        return connection;
    }

    public static String getContent(HttpURLConnection connection) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
        String line;
        StringBuilder sb = new StringBuilder("");
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    public static JsonReader getReader(HttpURLConnection connection) throws IOException {
        JsonReader reader = new JsonReader(new StringReader(getContent(connection)));
        reader.setLenient(true);
        return reader;
    }
}