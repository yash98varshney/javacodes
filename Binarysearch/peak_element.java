package Binarysearch;

public class peak_element {
    public static int peakelement(int[] arr,int n){
        int s=0;
        int e=n-1;
        

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid>0 && mid<n-1){

                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                    return(mid);
                }
                else if(arr[mid-1]>arr[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else if(mid==0){
                if(arr[0]>arr[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if(mid==n-1){
                if(arr[n-1]>arr[n-2]){
                    return n-1;
                }
                else{
                    return n-2;
                }
            }
        }
        return(-1);
    }

    public static void main(String[] agrs){
        int[] arr={12 ,13, 4, 7 ,10 ,10 ,6 ,2, 8, 14, 3 ,13};
        int ans=peakelement(arr,12 );
        System.out.println(ans);
    }
}


//https://www.youtube.com/watch?v=OINnBJTRrMU