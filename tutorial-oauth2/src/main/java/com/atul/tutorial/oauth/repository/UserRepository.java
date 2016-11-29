package com.atul.tutorial.oauth.repository;

import org.springframework.data.repository.CrudRepository;

import com.atul.tutorial.oauth.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByLogin(String login);
}