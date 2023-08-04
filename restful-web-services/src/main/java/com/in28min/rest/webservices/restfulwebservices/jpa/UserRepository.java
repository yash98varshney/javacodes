package com.in28min.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28min.rest.webservices.restfulwebservices.user.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
