package com.example.junitpractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Order;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@Order(1)
public class DietPlanTest {
    DietPlanner planner;
    @BeforeEach
    void objectOfdietPlanner(){
        planner=new DietPlanner(20,30,50);
    }



    // Check for Object Equal  


    @Test
    void calculateDietTest(){
        //given
        Coder cd=new Coder(1.82, 75.0, 26, Gender.MALE);
        DietPlan expected=new DietPlan(2202,110,73,275);

        //when
        DietPlan actual=planner.calculateDiet(cd);

        //then
       assertAll(
        ()-> assertEquals(expected.getCalories(), actual.getCalories()),
        ()-> assertEquals(expected.getProtein(), actual.getProtein()),
        ()-> assertEquals(expected.getFat(), actual.getFat())
       );
    }
}
