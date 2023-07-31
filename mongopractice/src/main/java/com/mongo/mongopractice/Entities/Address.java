package com.mongo.mongopractice.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Address {
    
    private String address1;
    private String address2;
    private String city;
}
