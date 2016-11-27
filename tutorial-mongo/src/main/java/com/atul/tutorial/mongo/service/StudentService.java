package com.atul.tutorial.mongo.service;

import java.util.List;

import com.atul.tutorial.mongo.domain.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudentByRollNo(Integer rollNo);
	
	List<Student> getStudentsByNameLike(String name);


}
