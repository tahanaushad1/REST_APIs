package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/web")
public class WishController {
	@GetMapping("/webClient")
	public String webClient() {
	String uri="http://localhost:8081/api1/state";
	WebClient client= WebClient.create();
	String str=client.get()
			.uri(uri)
			.retrieve()
			.bodyToMono(String.class)
			.block();
	return str;
	
	
	}
	@GetMapping("/rest")
	public String restTemp() {
		String url="http://localhost:8081/api1/msg";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String>re=rt.getForEntity(url, String.class);
		re.getBody();
		System.out.println(re.getBody());
		return re.getBody();
		
	}
	 
}

