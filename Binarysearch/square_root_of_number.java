package Binarysearch;

public class square_root_of_number {
    
    public static long wholepart(int n){
        int s=0;
        int e=n;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(mid*mid==n){
                return(mid);
            }
            if(mid*mid<n){
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

    public static void main(String[] args){

        int n=
        2147395599;
        long ans=wholepart(n);
        System.out.println(ans);
    }
}
