package com.example.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.entity.EmployeeInfo;
import com.example.demo.entity.SalaryInfo;
import com.example.demo.repository.Employee_repo;
import com.example.demo.repository.Salary_repo;
import com.example.demo.service.Employee_service;
@Service
public class ServiceImp implements Employee_service {
	@Autowired
	private Employee_repo employee_repo;
	@Autowired
	private Salary_repo salary_repo;

	@Override
	public String saveEmp_Info(EmployeeDTO employeeDTO) {
		EmployeeInfo emi=new EmployeeInfo();
		emi.setName(employeeDTO.getName());
		emi.setAddress(employeeDTO.getAddress());
		emi.setPhno(employeeDTO.getPhno());
		
		employee_repo.save(emi);
		return "save successfully!!!";
	}

	@Override
	public String saveSal_Info(EmployeeDTO employeeDTO) {
		SalaryInfo sli=new SalaryInfo();
		sli.setSalary(employeeDTO.getSalary());
		sli.setDepartment(employeeDTO.getDepartment());
		salary_repo.save(sli);
		return "save succesfully!!";
	}

}
