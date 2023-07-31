package com.mongo.mongopractice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.mongopractice.Entities.Person;
import com.mongo.mongopractice.Service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    private PersonService personService;

    @PostMapping
    public String save(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getpersonbyname(@RequestParam("name") String name){
        List<Person> person=personService.getPeronByname(name);
        return person;   
    }

    @GetMapping("/age")
    public List<Person> getByPersonAge(@RequestParam("min") int min,@RequestParam("max") int max){
        return personService.getPersonByAge(min,max);
    }
}
