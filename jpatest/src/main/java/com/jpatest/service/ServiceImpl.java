package com.jpatest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpatest.model.Student;
import com.jpatest.repo.DaoRepo;

@Service
public class ServiceImpl {

	
	@Autowired
	DaoRepo daoRepo;

	public Student postStudent(Student student) {
		return daoRepo.save(student);
	}
	
	
}
