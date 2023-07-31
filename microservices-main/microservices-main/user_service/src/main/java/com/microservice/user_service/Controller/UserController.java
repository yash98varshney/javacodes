package com.microservice.user_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.user_service.Entity.Contact;
import com.microservice.user_service.Entity.User;
import com.microservice.user_service.Service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value = "/{userID}" , method = RequestMethod.GET)
    public User getUser(@PathVariable("userID") Long userId){
        User user=userService.getUser(userId);
        List<Contact> contacts= restTemplate.getForObject("http://contact-service/contacts/user/"+user.getUserId(), List.class);
        user.setContacts(contacts);
        return user;
    }

}
