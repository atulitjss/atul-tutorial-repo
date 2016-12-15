package com.atul.tutorial.propertyplay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atul.tutorial.propertyplay.model.Student;

@RestController
public class PropertyPlayRestController {
	
	
	@RequestMapping(value="/api/v1/student/",method=RequestMethod.GET)
	public Student getStudent(){
		return new Student();
	}

}
