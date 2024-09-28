package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.StudentEntity;

public interface StudentService {
	public String saveStudentData(StudentEntity studentEntity);
	public Optional<StudentEntity> getId(int id);
	public List<StudentEntity>getAll();
	public String deleteById(int id);
	public String updateData(StudentEntity studentEntity);
	public long getCount();
	
	
	
	
	

}
