package Questions.prefix_suffix_sum;

public class leftsubarray_rightsubarray_sum_equal {
    
    public static int subarraysum(int[] arr,int n){
        // find prefix sum

        int[] prefix=new int[n];
        int[] suffix=new int[n];

        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];

        for(int i=1;i<n;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }

        // finding suffix sum array 

        for(int i=n-2;i>=0;i--){
            suffix[i]=arr[i]+suffix[i+1];
        }

        // comparing prefix and suffix sum 

        for(int i=0;i<n-1;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return(-1);

    }

// space effcetive approach 
    public static int subarraysum1(int[] arr, int n){

        //leftsum= prefix[i]-arr[i];
        //rightsum=prefix[n-1]-prefix[i];

        int[] prefix=new int[n];
        prefix[0]=arr[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i]+arr[i];
        }

        for(int i=1;i<n-1;i++){
            int leftsum=prefix[i]-arr[i];
            int rightsum=prefix[n-1]-prefix[i];

            if(leftsum==rightsum){
                return(i);
            }
        }
        return(-1);

    }

    // brute force approach 
    public static int subarraysum2(int n,int[] arr){
        

        for(int i=1;i<n;i++){

            int rightsum=0;
            int leftsum=0;
            for(int j=0;j<i;j++){
                rightsum+=arr[j];
            }
            for(int k=i+1;k<n;k++){
                leftsum+=arr[k];
            }

            if(rightsum==leftsum){
                return(i);
            }
        }
        return(-1);
    }

}
