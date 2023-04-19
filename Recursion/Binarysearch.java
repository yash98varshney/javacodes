package Recursion;

public class Binarysearch {
    public static boolean Binaryserch(int[] arr,int si,int ei,int key){
        if(si>ei){
            return(false);
        }

        int mid=ei+(ei-si)/2;

        if( arr[mid]==key){
            return true;
        }
        if(arr[mid]<key){
            return Binaryserch(arr, mid+1, ei, key);
        }
        else{
            return Binaryserch(arr, si, mid-1, key);
        }

    }   
}
