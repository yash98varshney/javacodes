package Recursion;

public class Last_Index {
    private static int firstIndex(int[] arr , int i,int n){
        if(i==-1){
            return(-1);
        }
        if(arr[i]==n){
            return(i);
        }
        int ans=firstIndex(arr, i-1, n);
        return(ans);

    }
//helper function
    public static int firstIndex(int[] arr,int n){
        return(firstIndex(arr, arr.length-1, n));
    }

    public static void main(String[] args){
        int[] arr={};
        int ans=firstIndex(arr,5);
        System.out.println(ans);
    }
}
