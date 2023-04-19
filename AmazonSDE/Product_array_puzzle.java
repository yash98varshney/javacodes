package AmazonSDE;

public class Product_array_puzzle {
    
    public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long[] pre=new long[n];
        long[] suf=new long[n];
        long[] ans=new long[n];
        if(n==1){
            ans[0]=1;
            return ans;
        }
        suf[n-1]=arr[n-1];
        pre[0]=arr[0];
        for(int i=n-2;i>=0;i--){
            suf[i]=arr[i]*suf[i+1];
        }

        for(int i=1;i<n;i++){
            pre[i]=arr[i]*pre[i-1];
        }
        
        for(int i=0;i<n;i++){
            if(i==0){
                ans[i]=suf[i+1];
            }
            else if(i==n-1){
                ans[i]=pre[i-1];
            }
            else{
                ans[i]=suf[i+1]*pre[i-1];
            }
            
            
        }
        return ans;
	} 
}
