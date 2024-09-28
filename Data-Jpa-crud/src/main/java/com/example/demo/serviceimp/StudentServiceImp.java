package com.example.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	StudentRepo studentRepo;

	@Override
	public String saveStudentdata(StudentEntity studentEntity) {
		studentRepo.save(studentEntity);
		return "Data save successfully....";
	}

}
