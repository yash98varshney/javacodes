package Questions.two_pointer;
import java.util.*;
//find maximum sum triplet with condition:- a[i]<a[j]<a[k] and 0<=i<j<k

public class find_triplet_with_condition {

    //Brute force 
    public static int Maxsum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] < arr[j] && arr[j] <arr[k]){
                        int s=arr[i]+arr[j]+arr[k];
                        if(s>sum){
                            sum=s;
                        }
                    }
                }
            }
        }
        return sum;

    }


    //O(n^2) approach 

    // So better approach is fixing value of J by running loop from 1-,n-1 because we want min 1 element at before J and one after J 
    // finding maximum on the left side of J which is smaller than A[j] and Finding maximum on right side of J which is greater than A[j].
    //check for max till now 
    
    
    public static int Maxsum2(int[] arr){
        int n=arr.length;
        int[] suffixArray=new int[n];

        //making suffix array 

        suffixArray[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            suffixArray[i]=Math.max(suffixArray[i+1],arr[i]);
        }

        int ans=0;
        TreeSet<Integer> tset =new TreeSet<>();

        //tset.add(Integer.MIN_VALUE);

        tset.add(Integer.MIN_VALUE);
        

        for(int i=0;i<n-1;i++){
            if(suffixArray[i+1]>arr[i]){
                ans=Math.max(ans, tset.lower(arr[i])+arr[i]+suffixArray[i+1]);     // we are using lower bound function which uses Binary search time for this is log n
                tset.add(arr[i]);  // and insertion also takes log n 
            }
        }
        return(ans);
        
    }
 
    public static void main(String[] args){
        int arr[]={3 ,7 ,4 ,2, 5, 7, 5};
        int ans =Maxsum2(arr);
        System.out.println(ans);
    }
}
