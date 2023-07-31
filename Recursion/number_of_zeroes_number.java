package Recursion;
// check number of zeroes in a number;

public class number_of_zeroes_number {
    public static int count(int n){
        if(n<10){
            if(n==0){
                return(1);
            }
            else{
                return(0);
            }
        }
        int ans=count(n/10);
        if(n%10==0){
            return(ans+1);
        }
        else{
            return(0);
        }
    }

    public static void main(String[] args){
        int ans= count(1000);
        System.out.println(ans);
    }
}
