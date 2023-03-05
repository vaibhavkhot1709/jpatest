package com.jpatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpatest.model.Student;
import com.jpatest.service.ServiceImpl;

@RestController
public class JpaController {
	
	
	@Autowired
	ServiceImpl service;
	
	
	@PostMapping("/jpatest")
	public Student postStudent(@RequestBody Student student) {
		
		return service.postStudent(student);
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello !!!";
	}
}
