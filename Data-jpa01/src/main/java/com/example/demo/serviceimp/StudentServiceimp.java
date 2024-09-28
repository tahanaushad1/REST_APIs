package com.example.demo.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.Studentrepo;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceimp implements StudentService {
	@Autowired
	Studentrepo studentrepo;

	@Override
	public String saveStudentData(StudentEntity studentEntity) {
	 studentrepo.save(studentEntity);
		
		return "Data save successfully.....";
	}

	

	@Override
	public Optional<StudentEntity> getId(int id) {
		return studentrepo.findById(id);
		
	}



	@Override
	public List<StudentEntity> getAll() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}



	@Override
	public String deleteById(int id) {
		studentrepo.deleteById(id);
		return "Delete successful...";
	}



	@Override
	public String updateData(StudentEntity studentEntity) {
		studentrepo.save(studentEntity);
		return "Update sucessfull...";
	}



	@Override
	public long getCount() {
		
		return studentrepo.count();
	}






	



	



	



	



	
	


	






	

	

	

	

	

	

	

	

	

	
	

	

}
