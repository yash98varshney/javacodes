package com.learning.expensetracker.repository;

import com.learning.expensetracker.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserInfo,Long> {

    UserInfo findByUsername(String username);
}
