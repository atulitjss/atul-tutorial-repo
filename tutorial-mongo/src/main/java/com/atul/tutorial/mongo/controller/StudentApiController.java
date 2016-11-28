package com.atul.tutorial.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atul.tutorial.mongo.domain.Student;
import com.atul.tutorial.mongo.service.StudentService;

@RestController
public class StudentApiController {

	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/api/v1/student/", method = RequestMethod.POST)
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@RequestMapping(value = "/api/v1/student/", method = RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/api/v1/student/rollNo/{rollNo}", method = RequestMethod.GET)
	public Student getStudentByRollNo(@PathVariable Integer rollNo) {
		return studentService.getStudentByRollNo(rollNo);
	}

	@RequestMapping(value = "/api/v1/student/name/like/{name}", method = RequestMethod.GET)
	public List<Student> getStudentsByNameLike(@PathVariable String name) {
		return studentService.getStudentsByNameLike(name);

	}

}
