package com.microservice.user_service.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.user_service.Entity.User;

@Service
public class UserServiceImpl implements UserService{


    List<User> userlist=List.of(
        new User(1311L, "Durgesh", "23564896"),
        new User(1312L, "Ravi", "21453697"),
        new User(1313L, "Ankit", "145397563"),
        new User(1314L, "Ram", "7896425863")
    );

    @Override
    public User getUser(Long id) {
        return userlist.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
    
}
