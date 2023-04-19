package AmazonSDE;

public class Maximum_sun_in_the_configuration {
    
    public int maxsum(int[] arr,int n){
        
        int sum=0;
        int S0=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            S0=S0+arr[i]*i;
        }

        int Si=S0;
        int max=S0;

        for(int i=0;i<n-1;i++){
            int Sip1=Si+sum-n*arr[n-i-1];

            if(Sip1>max){
                max=Sip1;
            }
            Si=Sip1;
        }
        return max;

    }
}


//https://www.youtube.com/watch?v=yroWfS5P2E4