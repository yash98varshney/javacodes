package Binarysearch;

public class firstoccurence {
    
    public static int occurence(int[] arr,int n,int k){
        int s=0;
        int e=n-1;
        int ans=Integer.MIN_VALUE;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]==k){
                ans=mid;
                e=mid-1;
            }
            if(arr[mid]>k){
                e=mid-1;
            }

            if(arr[mid]<k){
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        if(ans!=Integer.MIN_VALUE){
            return ans;
        }
        else{
            return(-1);
        }
    }

    public static void main(String[] args){
        int[] arr={0,0,1,1,2,2,2,4};
        int ans=occurence(arr, 8, 9);
        System.out.println(ans);
    }
}
