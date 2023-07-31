package com.example.junitpractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.function.*;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;


@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@Order(2)
public class BMICalculatorTest {
    
    @BeforeAll      // this only run once whnr this file is run and method must be static Like making database connections/servers
    static void beforeAll(){
        System.out.println("Before all must be static");
    }

    @Test
    @DisplayName("Deit Recommendation")
    void isDietRecommendedTest(){
        //given
        Double height=1.72;
        Double weight=89.0;

        //when
        Boolean expected=BMICalculator.isDietRecommended(weight, height);

        //then
        assertTrue(expected);
    }


    @Test
    @DisplayName("Checking Exception")
    void ExceptioncheckForDietRecom(){

        //given 
        Double height=0.0;
        Double weight=89.0;

        //when
       Executable executable =() -> BMICalculator.isDietRecommended(weight, height);

       //then
       assertThrows(ArithmeticException.class, executable);

    }


    @Test
    @DisplayName("Deit Recommendation")
    void findCoderWithWorstBMITest(){
        //given
        List<Coder> list=new ArrayList<>();
        list.add(new Coder(1.80, 60.0));
        list.add(new Coder(1.82, 98.0));

        //when
        Coder coderWithWorstBmi=BMICalculator.findCoderWithWorstBMI(list);

        //then
        assertAll(()-> assertEquals(1.82, coderWithWorstBmi.getHeight()),
        () -> assertEquals(98.0, coderWithWorstBmi.getWeight())
        );
    }


    // compare 2 array have equal connects or not

    @Test
    void getBMIScoresTest(){
        //given
        List<Coder> list=new ArrayList<>();
        list.add(new Coder(1.80, 60.0));
        list.add(new Coder(1.82, 98.0));
        double[] scores={18.52,29.59};
        //when 

        double[] actual=BMICalculator.getBMIScores(list);

        //then
        assertArrayEquals(scores, actual);   

    }


    // @BeforeEach 
    // cinema c=new Cinema("1" , "CinemaA");
    // @Test
    // public void addScreenTest(){
    //     //Given
    //     c.addScreen(new Screen("1","Scrren a"));

    //     Screen actual=new Screen("2","Screen B");

    //     //When
    //     Screen expected=c.getScreenByName("Screen B");

    //     //Then
    //     assertEquals(expected, actual);


    // }

    
}
