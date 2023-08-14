package com.in28min.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28min.rest.webservices.restfulwebservices.jpa.PostRepository;
import com.in28min.rest.webservices.restfulwebservices.jpa.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserJpaResource {

	private UserRepository userRepository;
	private PostRepository postRepository;
	
	public UserJpaResource(UserRepository repository,PostRepository postRepository) {
		this.userRepository=repository;
		this.postRepository=postRepository;
	}
	
	@GetMapping("/jpa/users")
	public List<User> retrieveAllUsers(){
		return userRepository.findAll();
	}
	
	
	@GetMapping("/jpa/users/{id}")
	public User retrieveUser(@PathVariable int id){
		Optional<User> user = userRepository.findById(id);
		
		if(user.isEmpty()) {
			throw new UserNotFoundException("id:" + id);
		}
		return user.get();
	}
	

	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User saveduser=userRepository.save(user);
		
		// created takes URI class object so we are trying to make the URL from current URL
		//and adding /id at the end of it
	//when we send the request again for post it will also show location header in the response
		
		URI location= ServletUriComponentsBuilder
							.fromCurrentRequest()
								.path("/{id}")
									.buildAndExpand(saveduser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id){
		userRepository.deleteById(id);
	}
	
	
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> retrievePostForUser(@PathVariable int id){
		User user=retrieveUser(id);
		return user.getPosts();
	}
	
	
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Post> createPostForUser(@PathVariable int id, @Valid @RequestBody Post post){
		User user=retrieveUser(id);
		post.setUser(user);
		Post savedPost=postRepository.save(post);
		URI location= ServletUriComponentsBuilder
				.fromCurrentRequest()
					.path("/{id}")
						.buildAndExpand(savedPost.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	@GetMapping("/jpa/users/{id}/posts/{postId}")
	public Post retrievePostfromUser(@PathVariable int id , @PathVariable int postId ) {
		User user=retrieveUser(id);
		Optional<Post> posts=postRepository.findById(postId);
		if(posts.isEmpty()) {
			throw new PostNotFoundException("PostID: "+postId);
		}
		return posts.get();

	}
}
