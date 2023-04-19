package com.mongo.mongopractice.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongo.mongopractice.Entities.Person;

@Repository 
public interface PersonRepository extends MongoRepository<Person,String>{
    List<Person> findByFirstNameStartsWith(String name);   
    //List<Person> findByAgeBetween(int min,int max);

    @Query(value = "{'age': { $gt : ?0 , $lt : ?1 }}")
    List<Person> findPersonByAgeBetween(int min,int max);

}
