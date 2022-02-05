package com.example.employee.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

public class DemoRestTemplate {
    @Autowired
    RestTemplate restTemplate;

    public void demo(){
        // get
        ResponseEntity<Map> response =restTemplate.getForEntity("http://localhost:8080", Map.class);// returns Response Entity
        Map response1 = restTemplate.getForObject("http://localhost:8080", Map.class); // returns  Object

        // get headers
        HttpHeaders httpHeaders = restTemplate.headForHeaders("fooResourceUrl");

        //post
        Map response2 = restTemplate.postForObject("hai", Collections.singletonMap("1","1"),Map.class);

        // put
        restTemplate.put("hai",Collections.singletonMap("1","1"));

        //delete
        restTemplate.delete("hai",Collections.singletonMap("1","1"));
    }
}
