package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std_sub")
public class Student_subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Maths")
	private int sub_Maths;
	@Column(name="Science")
	private int sub_Science;
	@Column(name="SST")
	private int sub_SST;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSub_Maths() {
		return sub_Maths;
	}
	public void setSub_Maths(int sub_Maths) {
		this.sub_Maths = sub_Maths;
	}
	public int getSub_Science() {
		return sub_Science;
	}
	public void setSub_Science(int sub_Science) {
		this.sub_Science = sub_Science;
	}
	public int getSub_SST() {
		return sub_SST;
	}
	public void setSub_SST(int sub_SST) {
		this.sub_SST = sub_SST;
	}

	     
	    
}
