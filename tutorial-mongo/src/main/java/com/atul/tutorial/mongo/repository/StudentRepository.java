package com.atul.tutorial.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atul.tutorial.mongo.domain.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{
	
	
	Student findStudentByRollNo(Integer rollNo);
	
	List<Student> findByNameLike(String nameQuery);
	
	
	

}
