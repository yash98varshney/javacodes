package Recursion;

public class multiplication {
    private static int mul(int n, int m,int num){
        if(num==m){
            return(n);
        }
        int ans=mul(n,m,num+1);
        return(n+ans);
    }

    public static int mul2(int n, int m){
        if(m==0){
            return(0);
        }
        int ans=mul2(n,m-1);
        return(n+ans);
    }

//helper function
    public static int mul(int n, int m){
        return(mul(n,m,1));
    }
    public static void main(String[] args){
        int ans=mul(2,30);
        System.out.println(ans);
    }
}
