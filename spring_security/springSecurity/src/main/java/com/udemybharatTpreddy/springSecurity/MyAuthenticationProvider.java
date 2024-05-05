package com.udemybharatTpreddy.springSecurity;

import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// Authentication object passed to the method has user name and password of the
		// user
		String userName = authentication.getName();
		String password = authentication.getCredentials().toString();
		if ("happy".equals(userName) && "happy".equals(password)) {
			return new UsernamePasswordAuthenticationToken(userName, password, Arrays.asList());
		} else {
			throw new BadCredentialsException("Invalid username or Password");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) { 
		// authentication object is provided by Authentication Manager
		// at runtime and it has information of what type of authentication it's looking for
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
