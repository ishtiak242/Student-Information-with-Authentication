package com.ishtiak.original_student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishtiak.original_student.model.User;
import com.ishtiak.original_student.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	public User fetchUser(String email) {
		return repository.findByEmail(email);
	}
	
	public User fetchUserLogin(String email, String password) {
		return repository.findByEmailAndPassword(email, password);
	}
	
}
