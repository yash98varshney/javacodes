package com.sprinbootjpa.springdatajpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprinbootjpa.springdatajpa.DbaModel.Student;


public interface StudentRepository extends JpaRepository<Student,Long>{  // long is the datatype of the primary key 
    
}
