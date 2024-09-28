package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="std_dlts")
public class Student_dlts {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
	   @Column(name="std_name")
	   private String std_name;
	   @Column(name="std_rollno")
	   private int std_rollno;
	   @Column(name="std_address")
	   private String std_address;
	   @Column(name="std_phno")
	   private long std_phno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public int getStd_rollno() {
		return std_rollno;
	}
	public void setStd_rollno(int std_rollno) {
		this.std_rollno = std_rollno;
	}
	public String getStd_address() {
		return std_address;
	}
	public void setStd_address(String std_address) {
		this.std_address = std_address;
	}
	public long getStd_phno() {
		return std_phno;
	}
	public void setStd_phno(long std_phno) {
		this.std_phno = std_phno;
	}
	

  }


	

