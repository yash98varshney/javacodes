package AmazonSDE.Allocation_problem;


public class Roti_Prata_Spoj {
    

    public static int Mincooktime(int[] arr,int N,int roti){

        //Search space 
        int s=0;
        int e=Integer.MAX_VALUE;
        int ans=0;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(ispossible(arr,N,roti,mid)){
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

    public static boolean ispossible(int[] arr,int N,int roti,int mid){

        int time=0;
        int para=0;

        for(int i=0;i<N;i++){
            time=arr[i];
            int j=2;
            while(time<=mid){
                para++;
                time=time+(arr[i]*j);
                j++;
            }
            if(para>=roti){
                return true;
            }
        }
        return false;
    }

}
