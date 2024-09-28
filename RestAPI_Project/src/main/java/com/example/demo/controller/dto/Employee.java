package com.example.demo.controller.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private String name;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
