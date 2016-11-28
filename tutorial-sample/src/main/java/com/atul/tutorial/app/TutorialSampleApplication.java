package com.atul.tutorial.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atul.tutorial.mongo.domain.Student;
import com.atul.tutorial.mongo.service.StudentService;




@Configuration
@EnableAutoConfiguration
@EnableMongoRepositories({"com.atul.tutorial.mongo.repository"})
@EnableMongoAuditing
@SpringBootApplication
@ComponentScan({"com.atul.tutorial.mongo.*"})
@RestController
public class TutorialSampleApplication {

	@Autowired
	private StudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(TutorialSampleApplication.class, args);
	}
	
	@RequestMapping(value="/students/",method=RequestMethod.GET)
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
}
