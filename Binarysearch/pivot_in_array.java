package Binarysearch;

// 7 8 9 1 2 3 : --one is pivot in this case

public class pivot_in_array {
    
    public static int pivot(int[] arr,int n){

        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;

        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return(s); // we can also return e both will point to same index;
    }

    public static void main(String[] args){
        int[] arr={18 ,31 ,47, 124 ,165, 178, 183, 227, 228 ,302 ,304, 335 ,367 ,385, 399 ,420 ,424, 446, 494 ,497 ,533, 549, 558 ,576 ,577 ,644, 663, 699, 703 ,721 ,742 ,757, 761 ,768, 773, 801 ,810 ,827 ,897 ,929 ,981, 997};
        int ans=pivot(arr, 42);
        System.out.println(ans);
    }
}
