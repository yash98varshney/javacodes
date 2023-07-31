package Questions.Mathematics;

public class LCM {
    public static int hcf(int a, int b){
        if (b==0){
            return(a);
        }
        return(hcf(b,a%b));
    }
    public static int lcm(int a,int b){
        int hcf=hcf(a,b);
        int lcm=(a*b)/hcf;
        return(lcm);
    }

    public static void main(String[] args){
        int ans=lcm(1,3);
        System.out.println(ans);
    }
}
