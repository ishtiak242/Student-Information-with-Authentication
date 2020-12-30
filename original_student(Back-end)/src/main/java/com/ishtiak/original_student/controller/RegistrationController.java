package com.ishtiak.original_student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishtiak.original_student.model.User;
import com.ishtiak.original_student.service.RegistrationService;

@RestController
@RequestMapping("/api")
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registration")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception{
		String tempEmail = user.getEmail();
		if(tempEmail != null && "".equals(tempEmail)) {
			User obj = service.fetchUser(tempEmail);
			if(obj != null) {
				throw new Exception("User with " +tempEmail+" is already usered!!");
			}
		}
		User obj = null;
		obj = service.saveUser(user);
		return obj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception{
		String tempEmail = user.getEmail();
		String tempPass = user.getPassword();
		User obj = null;
		if(tempEmail != null && tempPass != null) {
			obj = service.fetchUserLogin(tempEmail, tempPass);
		}
		if(obj == null) {
			throw new Exception("Invalid User!!!");
		}
		return obj;
	}
	
//	@PostMapping("/login")
//	public User login(@RequestBody String user) {
//		String tempEmail = user.getEmail();
//		String tempPass = user.getPassword();
//		String obj = "SELECT * FROM customer WHERE email = " + tempEmail;
//		if(obj == tempEmail) {
//			
//		}
//	}

}
