package Recursion;

public class primenumber {
    public static boolean checkprime(int n,int i){
        //base case
    
        if(n==2){
            return(true);
        }
        if(n%i==0){
            return(false);
        }

        //calculation 

        if(i*i>n){
            return(true);
        }
        boolean ans=checkprime(n,i+1);
        return(ans);
    }

    public static void main(String[] args){
        boolean ans=checkprime(90, 2);
        System.out.println(ans);
    }
}
