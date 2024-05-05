package com.udemybharatTpreddy.springSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class MySecurityConfig {
	
	//customAuthentication filter chain
	@SuppressWarnings("removal")
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//We want to implement basic authentication
		//http.formLogin();  for form login authentication 
		http.httpBasic();
		
		//we want every/any HTTPRequest to get authenticate
		http.authorizeHttpRequests().anyRequest().authenticated();
		
		//for our own custom filter 
		http.addFilterBefore(new MySecurityFilter(), BasicAuthenticationFilter.class);
		return http.build();
	}
	
	//Custom user detail service
	//One of the things can be used either this method or our custom AuthenticatonProvider for now we are using AuthenticatonProvider
//	@Bean
//	UserDetailsService userDetailsService() {
//		//InMemoryDetailsManager is implementation of UserDetailsService
//		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//		//Want to configure users on this DetailsService in memory user create kiya h using User class and Encoding the password using the method passwordEncoder
//		UserDetails user = User.withUsername("happy")
//								.password(passwordEncoder()
//								.encode("happy"))
//								.authorities("read") // this means what type of access this user has 
//								.build();
//		userDetailsService.createUser(user);
//		return userDetailsService;
//	}
	
	//To encode the password we are using BCrypt password encoder
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
