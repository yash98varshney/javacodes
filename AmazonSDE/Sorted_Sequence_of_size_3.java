package AmazonSDE;
import java.util.*;

public class Sorted_Sequence_of_size_3 {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        
        int [] minarr=new int[n];
        int[] maxarr=new int[n];
        minarr[0]=0;
        maxarr[n-1]=n-1;
        for(int i=1;i<n;i++){
            if(arr.get(minarr[i-1])<arr.get(i)){
                minarr[i]=minarr[i-1];
            }
            else{
                minarr[i]=i;
            }
        }
        
        for(int i=n-2;i>=0;i--){
            if(arr.get(maxarr[i+1])>arr.get(i)){
                maxarr[i]=maxarr[i+1];
            }
            else{
                maxarr[i]=i;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(minarr[i]!=i && maxarr[i]!=i){
                ans.add(arr.get(minarr[i]));
                ans.add(arr.get(i));
                ans.add(arr.get(maxarr[i]));
                break;
            }
        }
        return ans;
    }
}

//Approach to remember 

/* make 2 array  min till now and max till now check if conditionds and fill both array with index of elements 
    finally iterate over the array and check the if condition that min[i]!=i and max[i]!=i if this is true append elements in the list and break ;
*/