package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/demo")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	@PostMapping("/show")
	public String saveStudentDta(@RequestBody StudentEntity studentEntity) {
		return studentService.saveStudentData(studentEntity);
			
	}
	@GetMapping("/find/{id}")
	 public Optional<StudentEntity> getId(@PathVariable int id) {
		 return studentService.getId(id);
		 
	 }
	@GetMapping("/all")
	public List<StudentEntity>getAll(){
		return studentService.getAll();
	}
	@DeleteMapping("/del/{id}")
	 public String deleteById( @PathVariable int  id) {
		 return studentService.deleteById(id);
	 }
	@PutMapping("/up")
	public String updateData(@RequestBody StudentEntity studentEntity) {
		return studentService.updateData(studentEntity);
		
	}
	@GetMapping("/count")
	public long getCount() {
		return studentService.getCount();
		
	}
	
	
	
	
	
	
	

}
