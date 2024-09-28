package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class Rest_Templete {

    @GetMapping("/data")
    public String showData() {
        /*String uri ="http://localhost:8080/java/queryParam?name=Atif&address=Andhra&city=Mp";
        RestTemplate rt = new RestTemplate();
        try {
            ResponseEntity<String> re = rt.getForEntity(uri, String.class);
            System.out.println(re.getBody());
            return re.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred: " + e.getMessage();*/
    	return"test";
        }
    @GetMapping("/getMsg")
     public String getMsg() {
    	 String msg="Welcome to RestAPI";
    	 return msg;
     }
    }




