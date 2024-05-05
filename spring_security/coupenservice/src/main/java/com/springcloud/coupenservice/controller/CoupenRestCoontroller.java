package com.springcloud.coupenservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.coupenservice.model.Coupen;
import com.springcloud.coupenservice.repos.CoupenRepo;

@RestController
@RequestMapping("/coupenapi")
public class CoupenRestCoontroller {

	@Autowired
	CoupenRepo repo;
	
	@RequestMapping(value = "/coupens" , method = RequestMethod.POST)
	public Coupen create(@RequestBody Coupen coupen) {
		return repo.save(coupen);
	}
	
	@RequestMapping(value = "/coupens/{code}" , method = RequestMethod.GET)
	public Coupen getCoupen(@PathVariable("code") String code) {
		return repo.findByCode(code);
	}
}
