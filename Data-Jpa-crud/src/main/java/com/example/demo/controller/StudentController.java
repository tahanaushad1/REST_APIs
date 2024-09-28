package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/test")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping("/save")
	public String saveStudentData(@RequestBody StudentEntity studentEntity) {
		return studentService.saveStudentdata(studentEntity);
		
	}

}
