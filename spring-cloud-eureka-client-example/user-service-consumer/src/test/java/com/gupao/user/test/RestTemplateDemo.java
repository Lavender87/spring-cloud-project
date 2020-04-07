package com.gupao.user.test;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class RestTemplateDemo {

    public static void main(String[] args) {
        RestTemplate template= new RestTemplate();
        Map<String,Object> data= template.getForObject("http://localhost:8080/env",Map.class);

    }
}
