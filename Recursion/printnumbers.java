package Recursion;

public class printnumbers {
    public static void printnum(int x){
        if(x==1){
            System.out.print(x+ " ");
            return;
        }
        printnum(x-1);
        System.out.print(x+" ");
    }
    
    public static void main(String[] args){
        printnum(20);
    }
}
