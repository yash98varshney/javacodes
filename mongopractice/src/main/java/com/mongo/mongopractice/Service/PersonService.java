package com.mongo.mongopractice.Service;

import java.util.List;

import com.mongo.mongopractice.Entities.Person;

public interface PersonService {

    String save(Person person);

    List<Person> getPeronByname(String name);

    List<Person> getPersonByAge(int min, int max);


    
}
