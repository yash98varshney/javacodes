package com.yash.practice_project.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customer_id;
    @NotNull
    @NotEmpty(message = "Please enter first Name")
    String first_name;
    String last_name;
    String birth_date;
    String phone;
    String address;
    String city;
    String state;
    int points;
    
    
}
