package Binarysearch;

public class Kth_element_in_matrix {
    
    public static int Kth_smallest(int[][] arr,int k){
        int r=arr.length;
        int c=arr[0].length;
        int s=arr[0][0];
        int e=arr[r-1][c-1];
        int mid=s+(e-s)/2;
        while(s<=e){

            int ans=0;
            //Row wise traversing  

            for(int i=0;i<r;i++){

                // applying binary search row wise to check how many elements are smaller than mid

                int low=0;
                int high=r-1;
                int middle=low+(high-low)/2;

                while(low<=high){
                    if(arr[i][middle]<=mid){
                        low=middle+1;
                    }
                    else{
                        high=middle-1;
                    }
                }
                ans+=low;
            }

            if(ans<k){
                s=mid+1;
            }

            else{
                e=mid-1;
            }

        }
        return(s);
    }
}

//https://www.youtube.com/watch?v=G5wLN4UweAM
//https://www.youtube.com/watch?v=LkrsdWa69_Q
