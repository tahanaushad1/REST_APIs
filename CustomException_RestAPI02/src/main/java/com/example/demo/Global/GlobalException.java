package com.example.demo.Global;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exception.EmailValidationException;
import com.example.demo.Exception.MobileValidationException;
import com.example.demo.Exception.NameException;
import com.example.demo.error.ErrorCode;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(value=MobileValidationException.class)
	public ResponseEntity<ErrorCode>mobileValidation(MobileValidationException mobileValidationException){
		ErrorCode ec=new ErrorCode();
		ec.setErrorCode("CE88");
		ec.setErrorDesc(mobileValidationException.getMessage());
		ec.setDate(new Date());
		return new ResponseEntity<ErrorCode>(ec,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value=EmailValidationException.class)
	public ResponseEntity<ErrorCode>emailValidation(EmailValidationException emailValidationException){
		ErrorCode ec=new ErrorCode();
		ec.setErrorCode("CN99");
		ec.setErrorDesc(emailValidationException.getMessage());
		ec.setDate(new Date());
		return new ResponseEntity<ErrorCode>(ec,HttpStatus.BAD_REQUEST);      
	}
	@ExceptionHandler(value=NameException.class)
	public ResponseEntity<ErrorCode>nameException(NameException nameException){
		ErrorCode ec=new ErrorCode();
		ec.setErrorCode("N900");
		ec.setErrorDesc(nameException.getMessage());
		ec.setDate(new Date());
		return new ResponseEntity<ErrorCode>(ec,HttpStatus.BAD_REQUEST);
	}

}
