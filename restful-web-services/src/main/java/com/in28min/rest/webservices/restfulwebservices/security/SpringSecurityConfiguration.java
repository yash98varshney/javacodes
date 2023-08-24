package com.in28min.rest.webservices.restfulwebservices.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	
	/*
	 * Using this we are defining our own security filter chain if we cannot write any config
	 * than there is no security 
	 * 
	 *1)  All request should be authenticated 
	 *2) If a request is not authenticated, a web page is shown
	 *3) CSRF -> POST,PUT
	 */
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		
		//Step1 
		http.authorizeHttpRequests(
				auth ->auth.anyRequest().authenticated()
				);
		//Step 2 
		http.httpBasic(withDefaults());
		http.headers().frameOptions().disable();
		
		//Step 3
		http.csrf().disable();
		
		return http.build();
	}
}
