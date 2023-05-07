package com.springweb.productrestapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.productrestapi.Entities.products;
import com.springweb.productrestapi.Exception.APIRequestException;
import com.springweb.productrestapi.Repository.ProductRepository;

@RestController
public class ProductRestController {
    
    @Autowired
    ProductRepository repository;


    @RequestMapping(value = "/products/" , method = RequestMethod.GET)
    public List<products> getProducts(){
        return repository.findAll();
    }

    @RequestMapping(value = "/products/{id}" , method = RequestMethod.GET)  // requesting URI path variables using {id} id got captured and passed to function
    public products findproduct(@PathVariable("id") int id){                //   @PathVariable("id") binds the ID from path to our varaible
        return repository.findById(id).get();
    }

    @PostMapping("/products/")
    public void createProduct(@RequestBody products p){
        repository.save(p);
    }

    @PutMapping("/products/")
    public products updateProduct(@RequestBody products p){
        return repository.save(p);
    }

    @RequestMapping(value = "/products/{id}" , method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") int id){
        repository.deleteById(id);
    }

    @GetMapping("/all")
    public List<products> getNullproduct(){
        throw new APIRequestException("Custome Exception displayed");
    }
}
