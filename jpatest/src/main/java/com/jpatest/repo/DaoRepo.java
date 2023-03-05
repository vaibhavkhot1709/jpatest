package com.jpatest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpatest.model.Student;

public interface DaoRepo extends JpaRepository<Student, Integer> {

}
