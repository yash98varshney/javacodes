package Recursion;

public class calculate_power {
    public static int power(int x,int n){
        if(n==0){
            return(1);
        }
        int ans=x*power(x,n-1);
        return(ans);
    }
    
    //better approach
    
    public static int power2(int x,int n){
        if(n==0){
            return(1);
        }
        int xnp2=power(x,n/2);  // 1st line
        int xn=xnp2*xnp2;  //2nd line
        if(n%2==1){     //3rd line 
            xn=xn*x;
        }
        return(xn);  // 4th line
    }

    public static void main(String[] args){
        int ans=power(2,5);
        System.out.println(ans);
    }
    
}
