package com.practice.stockMarket1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.stockMarket1.Entity.Users;
import com.practice.stockMarket1.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public Users saveUser(Users user) {
		return repository.save(user);
	}
	

}