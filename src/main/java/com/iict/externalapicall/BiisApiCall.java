package com.iict.externalapicall;

import com.google.gson.JsonObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiisApiCall {
    public static void main(String[] args) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        /*List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);*/
//        this.restTemplate.setMessageConverters(messageConverters);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setBasicAuth(dataSourceConfigurationVO.getApiUsername(), dataSourceConfigurationVO.getApiPassword());
//        JsonObject jsonObject = new JsonObject();
//        HttpEntity<String> request = new HttpEntity<>(null, headers);
//        ResponseEntity<LoginModel> response =  restTemplate.postForEntity(new URI("http://biis.buet.ac.bd/BIIS_WEB/apiLogin.do?userName=dirIRAB&passWord=38dRcu"), request, LoginModel.class);
        ResponseEntity<LoginModel> response = restTemplate.getForEntity("http://biis.buet.ac.bd/BIIS_WEB/apiLogin.do?userName=dirIRAB&passWord=38dRcu", LoginModel.class);
        System.out.println(response.getBody());
    }
}
