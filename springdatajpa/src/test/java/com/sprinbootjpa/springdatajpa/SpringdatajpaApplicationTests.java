package com.sprinbootjpa.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprinbootjpa.springdatajpa.DbaModel.Student;
import com.sprinbootjpa.springdatajpa.Repository.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	void testSavestudent() {
		Student newStudent=new Student();
		newStudent.setId(1l);
		newStudent.setName("yash");
		newStudent.setTestScore(100);
		repository.save(newStudent);

		Student savedStudent=repository.findById(1l).get();

		assertNotNull(savedStudent);

		//using H2 database over here default server
	}

}
