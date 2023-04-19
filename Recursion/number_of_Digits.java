package Recursion;

public class number_of_Digits {
    public static int numcount(int n){
        int count=0;
        if(n==0){
            return(0);
        }
        int x=numcount(n/10);
        count=x+1;
        return(count);
    }

    public static void main(String[] args){
        int ans =numcount(123456789);
        System.out.println(ans);
    }
    
}
