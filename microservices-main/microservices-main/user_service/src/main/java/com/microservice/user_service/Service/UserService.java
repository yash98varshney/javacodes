package com.microservice.user_service.Service;

import com.microservice.user_service.Entity.User;

public interface UserService {
    
    public User getUser(Long id);
}
