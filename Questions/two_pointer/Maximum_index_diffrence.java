package Questions.two_pointer;

public class Maximum_index_diffrence {
    //Method 1:- 

    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int[] prefix_min=new int[n];
        int[] suffix_max=new int[n];
        prefix_min[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix_min[i]=Math.min(prefix_min[i],prefix_min[i-1]);
        }
        suffix_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix_max[i]=Math.max(suffix_max[i],suffix_max[i+1]);
        }
        
        int i=0;
        int j=0;
        int max_diff=-1;
        while(i<n && j<n){
            if(prefix_min[i]<=suffix_max[j]){
                max_diff=Math.max(max_diff,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return(max_diff);
    }

    public static int maxIndexdiff2(int[] arr,int n){
        int s=0;
        int e=n-1;
        int max_diff=0;
        while(s<=e){
            if(arr[s]<=arr[e]){
                max_diff=Math.max(max_diff,e-s);
                s++;
                e=n-1;
            }
            else{
                e--;
            }
        }
        return(max_diff);
    }
    
}


//https://practice.geeksforgeeks.org/problems/maximum-index-1587115620/1#

//https://www.youtube.com/watch?v=io3s3XS5zCw
