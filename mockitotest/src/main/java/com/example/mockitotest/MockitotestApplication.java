package com.example.mockitotest;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MockitotestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockitotestApplication.class, args);

		ObjectMapper om=new ObjectMapper();

		RestTemplate rt=new RestTemplate();

	}

}
