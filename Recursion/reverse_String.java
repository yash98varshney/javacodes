package Recursion;
// use 2 pointer approach and swap function

public class reverse_String {
    public static String rever(String str,int i){
        // String s=" ";
        if(i==str.length()){
            return(" ");
        }

        String ans=rever(str, i+1);
        return(ans+str.charAt(i));
    }

    public static void main(String[] args){
        String str="happy";
        String ans=rever(str, 0);
        System.out.println(ans);
    }
}
