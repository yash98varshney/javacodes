package com.example.mockitotest;

public class Stub implements SomeDataService{

    @Override
    public int[] retrieveAllData(){
        int[] arr={1,2,3,4,5};
        return arr;

    }

}
