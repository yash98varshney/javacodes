package Questions.two_pointer;
//Find pair whose sum is =K in unsorted array 
// Mthod 2- this solution will take nlog(n) time .
//Method 3:- Using hashmap

import java.util.Arrays;
import java.util.HashMap;

public class find_pair_unsorted {
    public static boolean pair(int[] arr,int k,int n){
        Arrays.sort(arr);

        int L=0;
        int R=n-1;

        while(L<R){
            if(arr[L]+arr[R]>k){
                R--;
            }
            else if(arr[L]+arr[R]<k){
                L--;
            }
            else if(arr[L]+arr[R]==k){
                return true;
            }
        }
        return false;

    }

    //Using HashMap:-  

    public static int[] pair2(int[] arr,int n,int target){
        int[] ans=new int[2];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int diff=target-arr[i];
            if(!map.containsKey(diff)){
                map.put(arr[i], i);
            }
            else{
                ans[1]=i;
                ans[0]=map.get(diff);
            }
        }
        return ans;
    }
}
