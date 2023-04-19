package com.example.mockitotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class someBussinessImplBasicTest {
    
    @Test
    public void calculateSumUsingDataService(){
        SomeBusinessImpl business=new SomeBusinessImpl();
        int actual=business.calculateSum(new int[] {1,2,3});
        int expected=6;

        assertEquals(expected, actual);
    }
}
