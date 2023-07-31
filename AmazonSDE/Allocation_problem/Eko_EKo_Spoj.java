package AmazonSDE.Allocation_problem;

public class Eko_EKo_Spoj {
    
    public int minlength(int[] arr,int n,int m){

        int max=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }

        int s=min;
        int e=max;

        int mid=s+(e-s)/2;
        int ans=0;
        while(s<=e){

            if(ispossible(arr, n, m, mid)){

                ans=mid;
                s=mid+1;
            }
            else{
               e=mid-1;
            }
            mid=s+(e-s)/2;
        }

        return ans;
    }

    public boolean ispossible(int[] arr,int n,int m,int mid){
        int sum=0;
        for(int i=0;i<n;i++){
            int diff=Math.abs(arr[i]-mid);
            sum+=diff;
        }

        if(sum>=m){
            return true;
        }
        return false;
    }
}
