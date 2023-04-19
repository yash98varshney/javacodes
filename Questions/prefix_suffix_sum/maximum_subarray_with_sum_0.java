package Questions.prefix_suffix_sum;
import java.util.*;
public class maximum_subarray_with_sum_0 {

    int maxLen(int arr[], int n)
    {
        // Your code here
        int max_len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        for(int i=0;i<n;i++){
            prefixsum+=arr[i];
            if(prefixsum==0){
                max_len=i+1;
            }
            else{
                if(map.get(prefixsum)!=null){
                    max_len=Math.max(max_len,i-map.get(prefixsum));
                }
                else{
                    map.put(prefixsum,i);
                }
            }
            
        }
        return max_len;
        
    }
    
}
