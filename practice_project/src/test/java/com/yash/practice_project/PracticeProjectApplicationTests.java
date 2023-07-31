package com.yash.practice_project;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.yash.practice_project.Entities.customers;

@SpringBootTest
class PracticeProjectApplicationTests {

	@Value("${productrestapi.services.url}")  // to generalize the base url this variable is made in app.properties
	private String baseUrl;

	@Test
	public void testGetCustomers(){
		RestTemplate restTemplate =new RestTemplate();
		customers c=restTemplate.getForObject(baseUrl+"1",customers.class);
		assertNotNull(c);
	}

}
