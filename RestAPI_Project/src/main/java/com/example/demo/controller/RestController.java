package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.controller.dto.Employee;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/java")
public class RestController {
	@GetMapping("/test")
	public String test() {
		return "Successfully!";
	}

	@GetMapping("/queryParamEx")
	public String queryParamEx(@RequestParam("name") String name, @RequestParam("mobile") String mobile) {
		return name + "-- " + mobile;
	}

	@GetMapping("/pathParamEx/{name}/{mobile}")
	public String pathParamEx(@PathVariable("name") String name, @PathVariable("mobile") String mobile) {
		return name + "---" + mobile;
	}

	@PostMapping("/requestBodyEx")
	public Employee requestBodyEx(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;

	}

	@GetMapping(value = "/producesEx", produces = { "application/json", "application/xml" })
	public Employee producesEx(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;

	}

	@GetMapping(value = "/consumesEx", consumes = { "application/xml" }, produces = { "application/json" })
	public Employee consumesEx(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;

	}

}
