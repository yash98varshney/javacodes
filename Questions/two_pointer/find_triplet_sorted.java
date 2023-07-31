package Questions.two_pointer;

// find triplet whose sum is =K in sorted array 

public class find_triplet_sorted {
    public static boolean triplet(int[] arr,int k,int n){
        int L;
        int R;
        // a+b+c =k 
        //b+c=k-a;  so we can treate this as k'

        for(int i=0;i<n-2;i++){  // because we want a to be at third last index

            int a=arr[i];
            int newK=k-a;

            L=i+1;
            R=n-1;

            while(L<R){
                if(arr[L]+arr[R]>newK){
                    R--;
                }
                else if(arr[L]+arr[R]<newK){
                    L++;
                }
                else if(arr[L]+arr[R]==newK){
                    return(true);
                }
            }

        }
        return false;
    }
}
