package com.learning.expensetracker.service;

import com.learning.expensetracker.entities.UserInfo;
import com.learning.expensetracker.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

@Component
@AllArgsConstructor
@Data
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final PasswordEncoder passwordEncoder;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserInfo user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("could not found the user ..!!");
        }
        return new CustomUserDetails(user);
    }

    public UserInfo checkIfUserAlreadyExists(UserInfo user){
        return userRepository.findByUsername(user.getUsername());
    }

    public Boolean signUpUser(UserInfo user){

        //Define a function to check if Email and password is valid ot not means check for Regex

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if(Objects.nonNull(checkIfUserAlreadyExists(user))) {
            return false;
        }
        String userId= UUID.randomUUID().toString();
        userRepository.save(new UserInfo(userId,user.getUsername(),user.getPassword(),new HashSet<>()));
        return true;
    }
}
