@FunctionalInterface
interface Lambdacheck{
    public void display(String s);
}

public class Lambda_expression2 {

    public Lambda_expression2(){

    }
    public Lambda_expression2(String s){
        System.out.println(s.toUpperCase());
    }

    public static void rever(String s){
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }

    public  void rever2(String s){
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args){
        //Method refrence as Constructor 
        Lambdacheck mc=Lambda_expression2::new;
        mc.display("Hello");

        // Method refrence using Static methods 
        Lambdacheck mc2=Lambda_expression2::rever;
        mc2.display("Hello");

        //Method reference without static method
        Lambda_expression2 mx=new Lambda_expression2();
        Lambdacheck mc3=mx::rever2;
        mc3.display("yash");



    }
}
