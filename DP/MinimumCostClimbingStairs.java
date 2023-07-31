package DP;

public class MinimumCostClimbingStairs {
    
    public int recurssion(int st,int i){

        // if(st<0){
        //     return 0;
        // }

        // if(st==0){
        //     return 1;
        // }

        // return recurssion(st-1)+recurssion(st-2);

        if(i==st){
            return 1;
        }

        if(i>st){
            return 0;
        }

        return recurssion(st,i+1)+recurssion(st,i+2);
    }

    public int mincost(int[] cost){
        int n=cost.length;

        return Math.min(helper(cost,n-1),helper(cost,n-2));
    }

    public int helper(int[] cost,int n){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }

        int a=helper(cost,n-1);
        int b=helper(cost,n-2);
        int result=Math.min(a,b)+cost[n];
        return result;
    }


    // Top down approach 

    int TopDown(int[] cost){
        int n=cost.length;

        //Step 1 
        int[] dp=new int[n+1];

        return Math.min(helper2(cost,n-1,dp),helper2(cost, n-2,dp));
    }

    private int helper2(int[] cost,int n,int[] dp){
        if(n==0){
            return cost[0];
        }

        if(n==1){
            return cost[1];
        
        }

        // Step3:- 

        if(dp[n]!=-1){
            return dp[n];
        }

        int a=helper2(cost, n-1, dp);
        int b=helper2(cost, n-2, dp);

        // Step2 :- 

        dp[n]=Math.min(a,b)+cost[n];
        return dp[n];
    }



    //Bottom up approach 

    int helper3(int[] cost,int n){

        //Step1 
        int[] dp=new int[n+1];

        //Step2 
        dp[0]=cost[0];
        dp[1]=cost[1];

        //Step3 

        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }

        return Math.min(dp[n-1],dp[n-2]);

    }

    int bottomDown(int[] cost){
        int n=cost.length;

        return helper3(cost,n);
    }


}
