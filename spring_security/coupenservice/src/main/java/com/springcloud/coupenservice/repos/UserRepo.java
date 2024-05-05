package com.springcloud.coupenservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.coupenservice.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
