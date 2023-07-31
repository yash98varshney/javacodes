package Sorting;

//import java.lang.*;
import java.util.*;

public class sort_on_the_basis_of_abs_value {
 
    public static Integer[] sort_abs(Integer[] arr,int n){
        Arrays.sort(arr,new Comparator<Integer>() {
            @Override
            public int compare(Integer i1,Integer i2){
                return Math.abs(i1) - Math.abs(i2);
            }
        });
        return(arr);
    }
    public static void main(String[] args){
        Integer[] arr={1, 2 ,-2, 4 ,-5};
       // Integer[] ans=sort_abs(arr, 5);
        // for(int i=0;i<5;i++){
        //     System.out.println(ans[i]);
        // }

        Arrays.sort(arr,new customcomaparator());
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}


class customcomaparator implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        return Math.abs(i1)-Math.abs(i2);
    }
}

