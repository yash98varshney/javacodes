package com.in28min.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {

	private UserDaoService service;
	
	public UserResource(UserDaoService service) {
		this.service=service;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.finAll();
	}
	
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id){
		User user = service.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("id:" + id);
		}
		return user;
	}
	

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User saveduser=service.save(user);
		
		// created takes URI class object so we are trying to make the URL from current URL
		//and adding /id at the end of it
	//when we send the request again for post it will also show location header in the response
		
		URI location= ServletUriComponentsBuilder
							.fromCurrentRequest()
								.path("/{id}")
									.buildAndExpand(saveduser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		service.deleteById(id);
	}
}
