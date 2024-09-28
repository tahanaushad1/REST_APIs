package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="std_marks")
public class Student_Marks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Maths")
	private int marks_Maths;
	@Column(name="Science")
	private int marks_Science;
	@Column(name="SST")
	private int marks_SST;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks_Maths() {
		return marks_Maths;
	}
	public void setMarks_Maths(int marks_Maths) {
		this.marks_Maths = marks_Maths;
	}
	public int getMarks_Science() {
		return marks_Science;
	}
	public void setMarks_Science(int marks_Science) {
		this.marks_Science = marks_Science;
	}
	public int getMarks_SST() {
		return marks_SST;
	}
	public void setMarks_SST(int marks_SST) {
		this.marks_SST = marks_SST;
	}

}
