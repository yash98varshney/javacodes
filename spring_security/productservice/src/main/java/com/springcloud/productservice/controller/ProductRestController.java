package com.springcloud.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.productservice.dto.Coupen;
import com.springcloud.productservice.model.Product;
import com.springcloud.productservice.repo.ProductRepo;

@RestController
@RequestMapping(value = "/productapi")
public class ProductRestController {

	@Autowired
	ProductRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${coupenService.url}")
	private String coupenServiceURL;
	
	@RequestMapping(value="/products" , method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		Coupen coupen = restTemplate.getForObject(coupenServiceURL+product.getCoupenCode(), Coupen.class);
		product.setPrice(product.getPrice().subtract(coupen.getDiscount()));
		return repo.save(product);
	}
	
	@RequestMapping(value = "/products/{id}" , method = RequestMethod.GET)
	public Product getproduct(@PathVariable("id") Long id) {
		return repo.findById(id).get();
	}
	
}
