package com.atul.tutorial.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atul.tutorial.oauth.data.User;
import com.atul.tutorial.oauth.data.UserRepository;



@RestController
public class UserController {

	private final UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping("/users")
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}

}