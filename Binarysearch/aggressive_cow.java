package Binarysearch;

import java.util.Arrays;

public class aggressive_cow {
    
    private static boolean isPossible(int[] arr,int n,int k,int mid){
        int cows=1;
        int diff=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]-diff>=mid){
                cows++;
                if(cows==k){
                    return true;
                }
                diff=arr[i];
            }
        }
        return false;
    }




    public static int agreesivecow(int[] arr,int k){
        int s=0;
        int ans=0;
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        int e=max;
        int mid=s+(e-s)/2;

        while(s<=e){
            if(isPossible(arr,arr.length,k,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return(ans);
    }
}
