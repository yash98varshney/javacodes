package Questions.two_pointer;
//find pair whose sum is =K  in sorted array return true if exist otherwise false 
//This is done in O(n).

public class find_pair_sorted {
    public static boolean pair(int k,int[] arr,int n){

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
}
