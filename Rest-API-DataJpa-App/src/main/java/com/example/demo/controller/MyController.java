package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CombinedDTO;
import com.example.demo.service.Student;
import com.example.demo.serviceimp.Student_impl;

@RestController
@RequestMapping("/api")
public class MyController {
	@Autowired
	private Student student;
	
	@PostMapping("/save")
	public ResponseEntity<String>InsertData(@RequestBody CombinedDTO combinedDTO){
        student.insertData(combinedDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Entities created successfully");
    }
	}


