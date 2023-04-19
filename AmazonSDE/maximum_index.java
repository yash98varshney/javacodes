package AmazonSDE;

public class maximum_index {
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
       int s=0;
       int e=n-1;
       
       int maxdiff=0;
       while(s<=e){
           if(arr[s]<=arr[e]){
               int diff=e-s;
               maxdiff=Math.max(maxdiff,diff);
               s++;
               e=n-1;
           }
           else{
               if(e==s+1){
                   s++;
                   e=n-1;
               }
               else{
                   e--;
               }
           }
       }
       return maxdiff;
    }
}
