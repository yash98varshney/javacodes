package DP;

public class Fibo {
    
    public int recurssion_method(int n){
        if(n==1 || n==0){
            return n;
        }

        return recurssion_method(n-1)+recurssion_method(n-2);
    }

    // Recursion + memoization 
    //Step 1 :- create Dp array 
    //Step 2 :- Store the result in Map or DP array all the element are -1
    //Step 3:- check if f(n) is already there in DP array

    public int memoization(int n , int[] dp){

        if(n==1 || n==0){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=memoization(n-1,dp)+memoization(n-2,dp);
        return dp[n];
    }


    //Tabulation method 

    public int tabulation(int n){
        
        //Step1 :- creating DP arrray
        int[] dp=new int[n+1];
        
        //Step 2:- assigning base case 
        dp[0]=0;
        dp[1]=1;

        //Step3:- changing recursion with for loop 

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}



