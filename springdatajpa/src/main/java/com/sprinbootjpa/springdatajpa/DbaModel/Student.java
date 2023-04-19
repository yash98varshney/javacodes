package com.sprinbootjpa.springdatajpa.DbaModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity  // to make this as JPA entity we mark this with @Entity 
public class Student {
    
    @Id // create a primary key we must add this 
    private long id;
    private String name;
    private int testScore;
}
