package Questions;
//import java.util.*;


//https://www.youtube.com/watch?v=B2hI-QPoisk 


public class find_frequency_of_element_of_array {
    //step1
    
    public static int[] range_array(int[] arr,int N,int K){

        for(int i=0;i<N;i++){
            arr[i]=arr[i-1];
        }

        //Step 2 increase each value by N by taking modulus

        for(int i=0;i<N;i++){
            arr[arr[i]%N]=arr[arr[i]%N]+N;

        }

        //Step3 making orignal frequency 

        for(int i=0;i<N;i++){
            arr[i]=arr[i]/N;
        }
        return arr;
    }
}
