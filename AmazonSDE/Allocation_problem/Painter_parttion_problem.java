package AmazonSDE.Allocation_problem;

public class Painter_parttion_problem {
    
    static long minTime(int[] arr,int n,int k){
        
        // search space 

        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
        }
        long s=0;
        long e=sum;
        long mid=s+(e-s)/2;
        long ans=0;
        while(s<=e){
            if(ispossible(arr,n,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    
    private static boolean ispossible(int[] arr,int n,int k,long mid){
        int painter=1;
        int wallsum=0;
        
        for(int i=0;i<n;i++){
            if(wallsum+arr[i]<=mid){
                wallsum+=arr[i];
            }
            else{
                painter++;
                if(painter>k || arr[i] >mid){
                    return false;
                }
                wallsum=arr[i];
            }
        }
        return true;
    }
}
