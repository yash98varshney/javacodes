package com.in28min.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users=new ArrayList<>();  
    private static int userCount=0;
    static{
        users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Jake",LocalDate.now().minusYears(20)));
    }
    
    public List<User> finAll(){
    	return users;
    }
    
    public User findOne(int id) {
    	return users.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
    }
    
    public User save(User user) {
    	user.setId(++userCount);
    	users.add(user);
    	return user;
    }
    
    public void deleteById(int id) {
    	users.removeIf(u -> u.getId()==id);
    }
}
