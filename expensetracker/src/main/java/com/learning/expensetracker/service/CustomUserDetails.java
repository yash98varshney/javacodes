package com.learning.expensetracker.service;

import com.learning.expensetracker.entities.UserInfo;
import com.learning.expensetracker.entities.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails extends UserInfo implements UserDetails {

    private String username;
    private String password;

    Collection<? extends GrantedAuthority> authorities;

    public CustomUserDetails(UserInfo byUsername){
        this.username=byUsername.getUsername();
        this.password=byUsername.getPassword();
        List<GrantedAuthority> auths=new ArrayList<>();

        for(UserRole role:  byUsername.getRoles()){
            auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
        }
        this.authorities=auths;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }
    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public String getUsername(){
        return username;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
