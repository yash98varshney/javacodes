package Recursion;

public class sum_of_digits {
    public static int sumofdg(int n){
        int sum=0;
        if(n<10){
            return(n);
        }

        int ans=sumofdg(n/10);
        int f=n%10;
        sum=f+ans;
        return(sum);

    }

    public static void main(String[] args ){
        int ans=sumofdg(1020);
        System.out.println(ans);
    }
}
