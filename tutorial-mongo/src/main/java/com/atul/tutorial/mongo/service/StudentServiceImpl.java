package com.atul.tutorial.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atul.tutorial.mongo.domain.Student;
import com.atul.tutorial.mongo.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Autowired
	private void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findStudentsbyRollNoDesc();
	}

	@Override
	public Student getStudentByRollNo(Integer rollNo) {
		return studentRepository.findStudentByRollNo(rollNo);
	}

	@Override
	public List<Student> getStudentsByNameLike(String name) {
		return studentRepository.findByNameLike(name);
	}
	
	
	
	
	

}
