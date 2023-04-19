package Questions;
import java.util.*;
public class Leaders_in_array {
    
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans=new ArrayList<>();
                
        int[] suffix=new int[n];
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=suffix[i+1]){
                suffix[i]=arr[i];
            }
            else{
                suffix[i]=suffix[i+1];
            }
        }
                
        for(int i=0;i<n;i++){
            if(arr[i]==suffix[i]){
                ans.add(arr[i]);
            }
        }
        return(ans);
    }
    
}
