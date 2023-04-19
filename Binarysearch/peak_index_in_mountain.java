package Binarysearch;

public class peak_index_in_mountain {
    
    public static int peak(int[] arr,int n){

        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;

        while(s<=e){
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            // else{                 // alternate way for below 2 if condition
            //     e=mid;
            // }


            if(arr[mid]>arr[mid+1]){
                e=mid-1;
            }
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return(mid);
            }
            mid=s+(e-s)/2;
            
        }
        return(-1);
    }

    public static void main(String[] args){
        int[] arr={1,15,25,45,42,21,17,12,11};
        int ans=peak(arr, 9);
        System.out.println(ans);
    }
}
