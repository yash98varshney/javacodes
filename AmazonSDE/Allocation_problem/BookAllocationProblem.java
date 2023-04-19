package AmazonSDE.Allocation_problem;

public class BookAllocationProblem {
    
    public int allocate(int[] arr,int N,int M){

        // search space for binary search 
        // sum of all pages
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }

        int s=0;
        int e=sum;

        int mid=s+(e-s)/2;
        int ans=0;
        while(s<=e){

            if(ispossible(arr,N,M,mid)){
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


    public boolean ispossible(int[] arr,int n,int m,int mid){
        int student=1;
        int pages=0;

        for(int i=0;i<n;i++){
            if(pages+arr[i]<=mid){
                pages+=arr[i];
            }
            else{
                student++;
                if(student>m || arr[i]>mid){
                    return false;
                }
                pages=arr[i];
            }
        }
        return true;
    }
}
