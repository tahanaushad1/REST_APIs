package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI_Demo {
	@GetMapping("/welcome") 
	public String getWelcomeMsg(@RequestParam("name") String name,@RequestParam("address") String address) {
		String msg="Welcome to RestAPI>>";
		return name+" "+address;
	}
	@GetMapping("/book/{name}")
	public ResponseEntity<String>getBookPrice(@PathVariable("name") String name){
		String msg=name +"4000$";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
}
