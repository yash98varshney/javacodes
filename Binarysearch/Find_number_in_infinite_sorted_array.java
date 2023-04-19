package Binarysearch;

//Unbounded binary search 

public class Find_number_in_infinite_sorted_array {
    
    public static int Binarysearch(int[] arr, int st,int en , int tar ){
        int mid=st+(en-st)/2;

        while(st<en){
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]>tar){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
            mid=st+(en-st)/2;

        }
        return -1;
    }

    public static int findNumber(int[] arr,int tar){
        if(arr[0]==tar){
            return 0;
        }

        int start=1;
        int first=0;
        int last=0;

        while(true){
            if(arr[start]==tar){
                return start;
            }
            else if(arr[start]<tar){
                first=start;
                start=start*2;
            }
            else{
                last=start;
                break;
            }
        }
        int ans=Binarysearch(arr, first+1,last-1,tar);
        return ans;
    }

}
