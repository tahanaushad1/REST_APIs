package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/demo")

public class RestControllerDemo {
	@GetMapping("/show")
	public ResponseEntity<String>show(){
		return new ResponseEntity<String>("Hello API!",HttpStatus.OK);
	}
	@GetMapping("/getName")
	public ResponseEntity<List>getName(){
		List li=new ArrayList<>();
		li.add("Taha");
		li.add("Altaf");
		li.add("Firoz");
		return new ResponseEntity<List>(li, HttpStatus.OK);
		
	}
	@GetMapping("/data")
	public String showData() {
		String uri="http://localhost:8082/demo/show";
		 RestTemplate rt=new RestTemplate();
		 ResponseEntity<String> re=rt.getForEntity(uri, String.class);
		 re.getBody();
		 System.out.println(re.getBody());
		 return re.getBody();

}
	@GetMapping("/client")
	public String webClient() {
		String url="http://localhost:8082/demo/getName";
		WebClient client= WebClient.create();
		String str=client.get()
				.uri(url)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		return str;
}
}
