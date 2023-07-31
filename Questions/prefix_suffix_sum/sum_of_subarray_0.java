package Questions.prefix_suffix_sum;

import java.util.HashMap;

public class sum_of_subarray_0 {
    
    public static String subsumzero(int[] arr){

        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(prefix[i]) || prefix[i]==0 || arr[i]==0){
                return("Yes");
            }
            else{
                map.put(prefix[i],1);
            }
        }
        return("No");
    }
}

// Make prefix array and check any number in the prefix array repeat if yes than we have 0 sub array 
// to do this we have use hashmap