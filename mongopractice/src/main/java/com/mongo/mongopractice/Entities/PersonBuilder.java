package com.mongo.mongopractice.Entities;

import java.util.List;

public interface PersonBuilder {
    
    PersonBuilder withfirstName(String fname);
    PersonBuilder withLastName(String lname);
    PersonBuilder withPersonID(String id);
    PersonBuilder withPersonAge(int age);
    PersonBuilder withHobiesList(List<String> hobbies);
    PersonBuilder withAdrress(List<Address> add);

    Person build();

    Person getPerson();


}
