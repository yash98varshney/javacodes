package AmazonSDE;

public class Equilibrium_point {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1){
            return 1;
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        
        //long temp=sum;
        long sumTillnow=0;
        for(int i=0;i<n;i++){
            sumTillnow=sumTillnow+arr[i];
            if(sumTillnow-arr[i]==(sum-sumTillnow)){
                return i+1;
            }
        }
        return -1;
    }
}
