package com.mongo.mongopractice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mongo.mongopractice.Entities.Person;
import com.mongo.mongopractice.Repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public String save(Person person) {
        return repository.save(person).getPersonid();
    }

    @Override
    public List<Person> getPeronByname(String name) {
        return repository.findByFirstNameStartsWith(name);
    }

    @Override
    public List<Person> getPersonByAge(int min, int max) {
        return repository.findPersonByAgeBetween(min,max);
    }
    


}
