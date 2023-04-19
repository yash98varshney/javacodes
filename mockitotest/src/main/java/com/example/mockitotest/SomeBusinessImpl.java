package com.example.mockitotest;

public class SomeBusinessImpl {
    
    //Dependency / service 
    private SomeDataService somedataservice;

    public SomeDataService getSomedataservice() {
        return somedataservice;
    }

    public void setSomedataservice(SomeDataService somedataservice) {
        this.somedataservice = somedataservice;
    }

    public int calculateSumUsingDataService(){
        int sum=0;
        int[] data=somedataservice.retrieveAllData();
        for(int val:data){
            sum+=val;
        }
        return sum;
    }

    public int calculateSum(int[] arr){
        int sum=0;
        
        for(int val:arr){
            sum+=val;
        }
        return sum;
    }

}
