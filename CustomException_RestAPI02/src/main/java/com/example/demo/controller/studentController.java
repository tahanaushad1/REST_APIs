package com.example.demo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.Student;
import com.example.demo.Exception.EmailValidationException;
import com.example.demo.Exception.MobileValidationException;
import com.example.demo.Exception.NameException;
import com.example.demo.error.ErrorCode;

@RestController
@RequestMapping("/std")
public class studentController {
	@PostMapping("/saveData")
	public Student saveData(@RequestBody Student student) {
		if(student.getMobile().isBlank()) {
			throw new MobileValidationException("Mobile number can not be blank");
		}else if(student.getMobile().length()<10) {
			throw new MobileValidationException("Mobile number must have 10 digit");
		}
		if(student.getName().isEmpty()) {
			throw new NameException("Name can not be blank");
			
		}
		System.out.println(student.getEmail().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"));
		if(!student.getEmail().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
			throw new EmailValidationException("inter valid email id");
		}
		return student;
		
		
	}
	/*
	 * @ExceptionHandler(value=MobileValidationException.class) public
	 * ResponseEntity<ErrorCode>mobileValidation(MobileValidationException
	 * mobileValidationException){ ErrorCode ec=new ErrorCode();
	 * ec.setErrorCode("CE88");
	 * ec.setErrorDesc(mobileValidationException.getMessage()); ec.setDate(new
	 * Date()); return new ResponseEntity<ErrorCode>(ec,HttpStatus.BAD_REQUEST); }
	 * 
	 * @ExceptionHandler(value=EmailValidationException.class) public
	 * ResponseEntity<ErrorCode>emailValidation(EmailValidationException
	 * emailValidationException){ ErrorCode ec=new ErrorCode();
	 * ec.setErrorCode("CN99");
	 * ec.setErrorDesc(emailValidationException.getMessage()); ec.setDate(new
	 * Date()); return new ResponseEntity<ErrorCode>(ec,HttpStatus.BAD_REQUEST); }
	 */

}
