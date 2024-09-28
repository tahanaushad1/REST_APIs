package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="salary_info")
public class SalaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sal_id;
	@Column(name="salary")
	private double salary;
	@Column(name="department")
	private String department;
	
	public int getSal_id() {
		return sal_id;
	}
	public void setSal_id(int sal_id) {
		this.sal_id = sal_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "SalaryInfo [sal_id=" + sal_id + ", salary=" + salary + ", department=" + department + "]";
	}
	

}
