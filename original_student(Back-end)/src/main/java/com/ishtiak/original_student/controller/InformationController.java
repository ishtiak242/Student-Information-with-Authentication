package com.ishtiak.original_student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishtiak.original_student.model.Information;
import com.ishtiak.original_student.repository.InformationRepository;
//import com.ishtiak.original_student.service.InformationService;



@RestController
@RequestMapping("/api")
public class InformationController {
	
	@Autowired
//	private InformationService service;
	
	private InformationRepository repo;
	
	
	@PostMapping("/information")
	@CrossOrigin(origins = "http://localhost:4200")
	public Information createInfo(@RequestBody Information info) {
		return this.repo.save(info);
	}
	
	@GetMapping("/allinformation")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Information> getAllInfo() {
		return this.repo.findAll();
	}

}
