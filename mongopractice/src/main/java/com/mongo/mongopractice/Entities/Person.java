package com.mongo.mongopractice.Entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "person")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)  // this will store only those feilds in mongoDB whichare non null


public class Person {
    
    private String personid;
    private String firstname;
    private String lastname;
    private Integer age;
    private List<String> hobbies;
    private List<Address> addresses;

}
