package com.springcloud.coupenservice.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class WebSecurityConfig {
	
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); 
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.httpBasic();
		http.authorizeHttpRequests()
			.antMatchers(HttpMethod.GET ,"/coupenapi/coupens/{code:^[A-Z]*$}")
			.hasAnyRole("USER","ADMIN")
			.antMatchers(HttpMethod.POST ,"/coupenapi/coupens")
			.hasRole("ADMIN").and()
			.csrf().disable();
		return http.build();
	}
}
