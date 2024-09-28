package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.service.Employee_service;

@RestController
@RequestMapping("/tcs")
public class EmployeeController {
	@Autowired
	Employee_service employee_service;
	@PostMapping("/save")
	public String saveEmpData(@RequestBody EmployeeDTO employeeDTO) {
		System.out.println(employeeDTO);
		employee_service.saveEmp_Info(employeeDTO);
		employee_service.saveSal_Info(employeeDTO);
		return"save Data";
	}
    

}
