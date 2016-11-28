package com.atul.tutorial.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atul.tutorial.swagger.model.Person;
import com.atul.tutorial.swagger.service.GreetingService;

@RestController
public class GreetingController {

	private GreetingService greetingService;

	@Autowired
	public void setGreetingServcie(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@RequestMapping(value = "/api/v1/greet", method = RequestMethod.POST)
	public String greet(@RequestBody Person person) {
		return greetingService.sayHello(person);
	}

	@RequestMapping(value="/api/v1/hello/{name}",method = RequestMethod.GET)
	public String sayhello(@PathVariable String name) {
		return "Hello" + name;
	}

}
