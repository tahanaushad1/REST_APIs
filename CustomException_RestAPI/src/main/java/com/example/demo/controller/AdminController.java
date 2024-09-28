package com.example.demo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.Employee;
import com.example.demo.Exception.EmailValidationException;
import com.example.demo.Exception.MobileValidationException;
import com.example.demo.error.ErrorMsg;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@PostMapping("/saveEmployeeData")
	public Employee saveEmployeeData(@RequestBody Employee employee) {
		if(employee.getMobile().isBlank()) {
			throw new MobileValidationException("Mobile number cannot be blank");
		}else if(employee.getMobile().length()<10) {
			throw new MobileValidationException("Mobile number can have 10 digit");	
		}
		System.out.println(employee.getEmail().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"));
		if(!employee.getEmail().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
			throw new EmailValidationException("inter valid email id");
		}
		return employee;
	}
	@ExceptionHandler(value=MobileValidationException.class)
	public ResponseEntity<ErrorMsg>mobileValidation(MobileValidationException mobileValidationException){
		ErrorMsg er=new ErrorMsg();
		er.setErrorCode("CB44");
		er.setErrorDesc(mobileValidationException.getMessage());
		er.setDate(new Date());
		return new ResponseEntity<ErrorMsg>(er,HttpStatus.BAD_REQUEST);	
	}
	@ExceptionHandler(value=EmailValidationException.class)
	public ResponseEntity<ErrorMsg>emailValidation(EmailValidationException emailValidationException){
		ErrorMsg er1=new ErrorMsg();
		er1.setErrorCode("CB55");
		er1.setErrorDesc(emailValidationException.getMessage());
		er1.setDate(new Date());
		return new ResponseEntity<ErrorMsg>(er1,HttpStatus.BAD_REQUEST);
	}
	

}
