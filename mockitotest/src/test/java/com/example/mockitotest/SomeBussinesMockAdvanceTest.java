package com.example.mockitotest;

//Reducing further the test making more neat 



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBussinesMockAdvanceTest {
    
    @InjectMocks
    SomeBusinessImpl bussiness; // creating instance of SomeBussinessImpl  and this inject dataservice mock to the setter Automatically

    @Mock
    SomeDataService dataServiceMock; // Creating Mock of the service


    @Test
    public void calculateSumUsingDataService_basic(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3,4});
        assertEquals(10, bussiness.calculateSumUsingDataService());

    }

    @Test
    public void calculateSumUsingDataService_empty(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(0, bussiness.calculateSumUsingDataService());

    }
    //Look for test for AnyInt/ Generic parameter 


    //We have a senario in which a particular function is not returning any value and we need to verify whether it is called 
    //with particular value or how may times it's been called 
    
    @Test
    public void verify_basic(){

        List<String> mock=mock(List.class);
 
        //SUT

        String value=mock.get(0);
        String value2=mock.get(1);

        //Verify(verify(mock).functionundertest())  

        verify(mock).get(0);  // check whether mock.get is called with value 0 or not 
        verify(mock,times(2)).get(anyInt());   // verify mock.get() is called exactly 2 times
        verify(mock,atLeast(1)).get(anyInt());    // atleast one time 
        verify(mock,atMost(2)).get(anyInt());  //atmost 1 
        verify(mock,never()).get(2);   // never get called with 2 as parameter 

    }

    @Test
    // We are not making any change to original function or creating any ArrayList.
    public void moking(){
        ArrayList ArrayListMock=mock(ArrayList.class);
        ArrayListMock.get(0);             // original behaviour is not retained using mock but using spy we can retain orinal behaviour of class
        ArrayListMock.size();                   // when all these are checked they will return it's default values as we have not set them/Stub them 
        ArrayListMock.add("Test");              // we only assign value to mock 
        ArrayListMock.add("Test2");

        when(ArrayListMock.size()).thenReturn(5);    // Now it will return size as 5 
       
        when(ArrayListMock.get(anyInt())).thenReturn(5); // Argument matcher also use Map,list,string etc .



       //Exception can be achieved this way
    //    when(ArrayListMock.get(anyInt())).thenThrow(RuntimeException.class);
       
    //     Exception ex=assertThrows(RuntimeException.class,()->{
    //         ArrayListMock.get(anyInt());
    //     });
    //     assertEquals("NumberFormatException was expected",ex.getMessage());
        
       
       
       
        assertEquals(5,ArrayListMock.size());
        assertEquals(5,ArrayListMock.get(100));

    }

    @Test
    public void spying(){

        ArrayList spyArrayList=spy(ArrayList.class);

        spyArrayList.add("Test"); 
        spyArrayList.get(0);             
        spyArrayList.size();                   
        spyArrayList.add("Test");             
        spyArrayList.add("Test2");

        when(spyArrayList.size()).thenReturn(5);    
        spyArrayList.size();

    }

    




}
