package com.atul.tutorial.propertyplay.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:student.properties")
public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.rollo}")
	private String rollNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	

}
