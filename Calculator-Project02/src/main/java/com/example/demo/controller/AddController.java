package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class AddController {
	@PostMapping("/add")
	public int addNumber(@RequestParam ("Num1")int Num1,@RequestParam("Num2")int Num2) {
		return Num1+Num2;
		
	}

}
