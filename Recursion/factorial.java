package Recursion;

public class factorial {
    public static int fact(int ele){
        if(ele==1){
            return(1);
        }
        int fac=ele*fact(ele-1);
        return(fac);
        
    }
    public static void main(String[] args){
        int f=fact(1);
        System.out.println(f);
    }
}
