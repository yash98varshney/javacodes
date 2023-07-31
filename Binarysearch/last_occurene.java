package Binarysearch;

public class last_occurene {
    
    public static int occurence(int[] arr,int n,int k){
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        int ans=Integer.MIN_VALUE;
        while(s<=e){

            if(arr[mid]==k){
                ans=mid;
                s=mid+1;
            }
            if(arr[mid]<k){
                s=mid+1;
            }
            if(arr[mid]>k){
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        if(ans!=Integer.MIN_VALUE){
            return(ans);
        }
        else{
            return(-1);
        }
    }

    public static void main(String[] args){
        int[] arr={0,0,2,3,4,4,4,6,6};
        int ans=occurence(arr, 9, 6);
        System.out.println(ans);
    }
}
