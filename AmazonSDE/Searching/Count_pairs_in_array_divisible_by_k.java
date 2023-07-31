package AmazonSDE.Searching;
import java.util.*;
public class Count_pairs_in_array_divisible_by_k {
    
    public static long countKdivPairs(int arr[], int n, int k)
    {
        //code here
        HashMap<Integer,Long> map=new HashMap<>();
        long ans=0;
        for(int i=0;i<n;i++){
            
            int rem=arr[i]%k;
            int comprem=k-rem;
            
            if(rem!=0){
                if(map.containsKey(comprem)){
                     ans=ans+map.get(comprem);
                     if(map.containsKey(rem)){
                         map.put(rem,map.get(rem)+1);
                     }
                     else{
                         map.put(rem,(long)1);
                     }
                     
                }
                else{
                    if(map.containsKey(rem)){
                        map.put(rem,map.get(rem)+1);
                    }
                    else{
                         map.put(rem,(long)1);
                    }
                   
                }
            }
            else{
                if(map.containsKey(0)){
                    ans=ans+map.get(0);
                    map.put(0,map.get(0)+1);
                }
                else{
                    map.put(0,(long)1);
                }
                
            }
           
        }
        return ans;
        
        
    }
}
//https://www.youtube.com/watch?v=IUami0pKijo