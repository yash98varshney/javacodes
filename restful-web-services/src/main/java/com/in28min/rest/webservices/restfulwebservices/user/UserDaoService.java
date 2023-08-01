package com.in28min.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users=new ArrayList<>();  

    static{
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(3,"Jake",LocalDate.now().minusYears(20)));
    }
    
    public List<User> finAll(){
    	return users;
    }
    
    public User findOne(int id) {
    	return users.stream().filter(x -> x.getId()==id).findFirst().get();
    }
}
