package com.springcloud.productservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.productservice.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {

}