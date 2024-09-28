package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Student;

import jakarta.websocket.server.PathParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/java")
public class RestController {
	@GetMapping("/showData")
	public String showData() {
		return"succesfull";
	}
	@GetMapping("/queryParam")
	public String queryParam(@PathParam("name")String name,@PathParam("address")String address,@PathParam("city")String city) {
		return "My name is"+"---"+name+"---"+"And I my from "+"---"+address+"---"+"My city is"+"---"+city;
	}
	@GetMapping("/pathParam/{name}/{address}/{city}")
	public String pathParam(@PathVariable("name")String name,@PathVariable("address")String address,@PathVariable("city")String city) {
		return name+"---"+address+"---"+city;
	}
	@PostMapping("/requestBody")
	public Student requestBody(@RequestBody Student student) {
		System.out.println(student);
		return student;
		
	}
	@GetMapping(value="/produces",
			produces={"application/xml","application/json"}
			)
	public Student produces(@RequestBody Student student) {
		System.out.println(student);
		return student;
		
	}
	@GetMapping(value="/consumes",
			consumes={"application/xml"}
			)
	public Student consumes(@RequestBody Student student) {
		System.out.println(student);
		return student;
		
	}
	@GetMapping(value="/consumes2",
			consumes={"application/json"},
			produces= {"application/xml"}
			)
	public Student consumes2(@RequestBody Student student) {
		System.out.println(student);
		return student;
		
	}
	
	

}
