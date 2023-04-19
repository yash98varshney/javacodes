package AmazonSDE.Allocation_problem;

public class Koko_Eating_bananas_LeetCode {
    
    public int minEatingSpeed(int[] piles,int h){

        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        // Search space 

        int s=0;
        int e=max;

        int mid=s+(e-s)/2;
        int ans=0;

        while(s<=e){
            if(isPossible(mid,piles,h)){
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

    private boolean isPossible(int mid,int[] arr,int h){
        int time=0;

        for(int i=0;i<arr.length;i++){
            time=time+(int)Math.ceil(arr[i]*1.0/mid);
        }
        return time<=h;
    }
}
