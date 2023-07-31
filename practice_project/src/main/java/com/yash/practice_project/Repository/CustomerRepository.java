package com.yash.practice_project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yash.practice_project.Entities.customers;

public interface CustomerRepository extends JpaRepository<customers,Integer> {

    @Query(value = "SELECT * FROM customers WHERE points>2000",nativeQuery = true)
    public List<customers> greater();
    
}
