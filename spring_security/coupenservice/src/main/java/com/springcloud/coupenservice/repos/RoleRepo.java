package com.springcloud.coupenservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.coupenservice.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
