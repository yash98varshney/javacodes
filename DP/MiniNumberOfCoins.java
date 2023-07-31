package DP;

public class MiniNumberOfCoins {
    
    public int miniCoin(int[] coin,int sum){

        int ans=helperRecursion(coin,sum);
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }

    int helperRecursion(int[] coin,int sum){

        if(sum==0){
            return 0;
        }

        if(sum< 0 ){
            return Integer.MAX_VALUE;
        }

        int mini=Integer.MAX_VALUE;

        for(int i=0;i<coin.length;i++){
            int ans=helperRecursion(coin, sum-coin[i]);
            if(ans!=Integer.MAX_VALUE){
                mini=Math.min(mini,ans+1);
            }
        }
        return mini;
    }
}
