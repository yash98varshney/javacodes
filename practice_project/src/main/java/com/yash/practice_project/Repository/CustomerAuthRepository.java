package com.yash.practice_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.practice_project.Entities.customer_auth;

public interface CustomerAuthRepository extends JpaRepository<customer_auth,Integer> {
    
}
