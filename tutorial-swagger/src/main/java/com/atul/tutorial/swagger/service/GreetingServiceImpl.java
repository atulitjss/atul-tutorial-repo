package com.atul.tutorial.swagger.service;

import org.springframework.stereotype.Service;

import com.atul.tutorial.swagger.model.Person;


@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello(Person person) {

		return "Hello" + person.getFirstName() + " " + person.getLastName();
	}

}
