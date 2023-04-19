package Recursion;

public class First_index {
    private static int firstIndex(int[] arr , int i,int n){
        if(i==arr.length){
            return(-1);
        }
        if(arr[i]==n){
            return(i);
        }
        int ans=firstIndex(arr, i+1, n);
        return(ans);

    }
//helper function
    public static int firstIndex(int[] arr,int n){
        return(firstIndex(arr, 0, n));
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int ans=firstIndex(arr,5);
        System.out.println(ans);
    }
}
