package com.mongo.mongopractice.Entities;

import java.util.List;

public class PersonConcreteBuilder implements PersonBuilder {

    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private List<String> hob;
    private List<Address> add;
    private Person p;

    @Override
    public PersonBuilder withfirstName(String fname) {
        firstName=fname;
        return this;
    }

    @Override
    public PersonBuilder withLastName(String lname) {
        lastName=lname;
        return this;
    }

    @Override
    public PersonBuilder withPersonID(String id) {
        this.id=id;
        return this;
    }

    @Override
    public PersonBuilder withPersonAge(int age) {
        this.age=age;
        return this;
    }

    @Override
    public PersonBuilder withHobiesList(List<String> hobbies) {
        hob=hobbies;
        return this;
    }

    @Override
    public PersonBuilder withAdrress(List<Address> add) {
        this.add=add;
        return this;
    }

    @Override
    public Person build() {
        p=new Person(id,firstName,lastName,age,hob,add);
        return p;
    }

    @Override
    public Person getPerson() {
        return p;
    }
    
}
