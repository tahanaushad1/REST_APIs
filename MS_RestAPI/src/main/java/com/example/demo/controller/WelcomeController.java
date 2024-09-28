package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class WelcomeController {
	@GetMapping("/msg")
	public String WelcomeMsg() {
		return "Hello My Rest Controller";
	}
	
	@GetMapping("/state")
	public List<String> getState(){
		List<String> al=new ArrayList();
		al.add("West Bengal");
		al.add("Odisa");
		al.add("Jharkhand");
		al.add("Goa");

		for(String a2:al) 
		{
		System.out.println(a2);
		}
		return al;
		
	}
	

}
