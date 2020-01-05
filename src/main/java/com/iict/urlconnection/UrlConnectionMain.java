package com.iict.urlconnection;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

public class UrlConnectionMain {
    public static void main(String[] args) {
        String token = "token_here";
        Map<String, String> requestPropertyMap = new HashMap<String, String>();
        requestPropertyMap.put("Authorization", "Bearer " + token);
        requestPropertyMap.put("Content-Type", "application/x-www-form-urlencoded");
        String method = "GET";
        String url = "url_here";
        try {
            HttpURLConnection connection = HttpUrlConnectionService.getHttpURLConnection(url, method, null, requestPropertyMap);
            Object yourObjectRef = new Gson().fromJson(HttpUrlConnectionService.getReader(connection), Object.class); // Please Put your serialized class instant of object class here
            connection.disconnect();
        } catch (IOException e) {
        }
    }
}
