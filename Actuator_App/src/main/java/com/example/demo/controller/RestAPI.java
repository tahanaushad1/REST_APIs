package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
	@GetMapping("/getData")
	public Map<String,String> getData(){
		return Map.of("Name","Firoz");
	}

}
