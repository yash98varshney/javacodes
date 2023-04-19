package Binarysearch;

public class Binarysearch {
    
    public static int binarysc(int[] arr,int n,int k){
        int l=0;
        int r=n-1;
        int mid=l+(r-l)/2;

        while(l<=r){
            
            if(arr[mid]==k){
                return(mid);
            }
            if(arr[mid]<k){
                l=mid+1; 
            }
            if(arr[mid]>k){
                r=mid-1;
            }
            mid=l+(r-l)/2;
        }
        return(-1);
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int ans=binarysc(arr, 8, 8);
        System.out.println(ans);
    }
}
