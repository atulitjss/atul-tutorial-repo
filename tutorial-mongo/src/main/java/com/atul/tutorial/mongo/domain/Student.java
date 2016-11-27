package com.atul.tutorial.mongo.domain;



import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	
	
	@Id
    public String code;
	
    @Indexed(unique=true)
	private Integer rollNo;
    
    @NotNull
	private String name;
	
	public Student(){
		
	}
	
	public Student(Integer rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
