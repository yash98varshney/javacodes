package Recursion;

public class sum_of_gp {
    public static double gp(int n){
        if(n==0){
            return 1;
        }

        double ans=gp(n-1);
        return(ans+(1/Math.pow(2,n)));
    }

    public static void main(String[] args){
        double ans=gp(1);
        System.out.println(ans);
    }
}
