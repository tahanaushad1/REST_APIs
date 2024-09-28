package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersUriSpec;

@RestController
public class Rest_Temp {
	@GetMapping("/data")
	public String showData() {
		String uri="http://localhost:8080/java/queryParam?name=Atif&address=Andhra&city=Mp";
		 RestTemplate rt=new RestTemplate();
		 ResponseEntity<String> re=rt.getForEntity(uri, String.class);
		 re.getBody();
		 System.out.println(re.getBody());
		 return re.getBody();
		 
	}
	@GetMapping("/client")
	public String webClient() {
		String url="http://localhost:8080/java/pathParam/firoz/WB/kolkata";
		WebClient client= WebClient.create();
		String str=client.get()
				.uri(url)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		return str;
		
	}
	
	
	
	
	
	
}
	