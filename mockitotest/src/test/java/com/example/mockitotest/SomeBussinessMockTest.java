package com.example.mockitotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SomeBussinessMockTest {
    SomeBusinessImpl bussiness=new SomeBusinessImpl();
    SomeDataService dataServiceMock=mock(SomeDataService.class);

    @BeforeEach
    public void before(){
        bussiness.setSomedataservice(dataServiceMock);
    }

    @Test
    public void calculateSumUsingDataService_basic(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3,4});
       
        int actual=bussiness.calculateSumUsingDataService();
        int expected=10;
        assertEquals(expected, actual);


    }

    @Test
    public void calculateSumUsingDataService_empty(){

       // bussiness.setSomedataservice(dataServiceMock);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        int expected=0;
        int actual=bussiness.calculateSumUsingDataService();

        assertEquals(expected, actual);
    }

    @Test
    public void calculateSumUsingDataService_single(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        //bussiness.setSomedataservice(dataServiceMock);
        int actual=bussiness.calculateSumUsingDataService();
        int expected=5;
        assertEquals(expected, actual);
    }
}
