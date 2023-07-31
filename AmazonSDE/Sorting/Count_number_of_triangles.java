package AmazonSDE.Sorting;

import java.util.Arrays;

public class Count_number_of_triangles {
    
    static int findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int count=0;
       for(int i=n-1;i>=0;i--){
           int r=i-1;
           int l=0;
           
           while(l<r){
               if(arr[l]+arr[r]>arr[i]){
                   count+=(r-l);
                   r--;
               }
               else{
                    l++;
               }
           }
       }
       return count;
    }
}
