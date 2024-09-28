package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/sirfjava")
public class Circuit_Demo {
	@GetMapping("/m1")
	@CircuitBreaker(name="My circuit breaker",fallbackMethod="m2")
	public String m1() {
		String msg="This is m1() method is response";
		try {
			int i=10/0;	
		}catch(Exception e) {
			e.printStackTrace();
			msg=m2();
			
		}
		return msg;
		
	}

      public  String m2() {
    	  System.out.println("fault back is executed");
		return "This is m2() method is response";
	}

}
