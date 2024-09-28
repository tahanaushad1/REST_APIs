package com.example.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CombinedDTO;
import com.example.demo.entity.Student_Marks;
import com.example.demo.entity.Student_dlts;
import com.example.demo.entity.Student_subject;
import com.example.demo.respository.Student_Marks_repo;
import com.example.demo.respository.Student_dlts_repo;
import com.example.demo.respository.Student_subject_repo;
import com.example.demo.service.Student;

@Service
public class Student_impl implements Student {
	@Autowired
	private Student_dlts_repo student_dlts_repo;
	@Autowired
	private Student_Marks_repo students_Marks_repo;
	@Autowired
	private Student_subject_repo student_subject_repo;
	@Override
	public void insertData(CombinedDTO combinedDTO) {
	
		Student_dlts std=new Student_dlts();
		std.setStd_name(combinedDTO.getStudent_dlts().getStd_name());
		std.setStd_address(combinedDTO.getStudent_dlts().getStd_address());
		std.setStd_rollno(combinedDTO.getStudent_dlts().getStd_rollno());
		std.setStd_phno(combinedDTO.getStudent_dlts().getStd_phno());
		student_dlts_repo.save(std);
		
		Student_Marks stm=new Student_Marks();
		stm.setMarks_Maths(combinedDTO.getStudent_Marks().getMarks_Maths());
		stm.setMarks_Science(combinedDTO.getStudent_Marks().getMarks_Science());
		stm.setMarks_SST(combinedDTO.getStudent_Marks().getMarks_SST());
		students_Marks_repo.save(stm);
		
		Student_subject sts=new Student_subject();
		sts.setSub_Maths(combinedDTO.getStudent_subject().getMaths());
		sts.setSub_Science(combinedDTO.getStudent_subject().getScience());
		sts.setSub_SST(combinedDTO.getStudent_subject().getSST());
		student_subject_repo.save(sts);
		
		
		
	}
	

	
}

