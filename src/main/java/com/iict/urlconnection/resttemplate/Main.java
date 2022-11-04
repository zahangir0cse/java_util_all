package com.iict.urlconnection.resttemplate;


import org.json.JSONObject;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
       
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("SerialNumber", "4728");
        jsonObject.put("ModifiedSince", "2022-10-17T00:00:00.0000000Z");
        jsonObject.put("ModifiedUntil", "2022-10-20T00:00:00.0000000Z");
        HttpEntity<String> request = new HttpEntity<>(jsonObject.toString(), headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(new URI("http://partnerhub.pbsdealers.com/json/reply/AppointmentGet"), request, String.class);
        System.out.println(stringResponseEntity.getBody());
    }
}
