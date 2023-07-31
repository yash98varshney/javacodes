package Recursion;

public class recusion_and_helper_func {
    private static boolean checkSorted(int[] arr,int i){
        if(i>=arr.length-1){
            return(true);
        }
        if(arr[i]>arr[i+1]){
            return(false);
        }
        boolean ans=checkSorted(arr, i+1);
        return(ans);
    }
// this is helper function now user only have to give array as input to the function
//We are using function overloading 

    public static boolean checkSorted(int[] arr){
        return checkSorted(arr,0);
    }

    public static void main(String[] args ){
        int[] arr={1,2,3,4,};
        boolean ans =checkSorted(arr);
        System.out.println(ans);
    }
}
