package Recursion;

public class replace_consicutive {
    public static String replacecons(String str){
        if(str.length()<=1){
            return(str);
        }
        if(str.charAt(0)==str.charAt(1)){
            return(replacecons(str.substring(1)));
        }
        else{
            String small=replacecons(str.substring(1));
            return(str.charAt(0)+small);
        }
    }

    public static void main(String[] args){
        String str="aaabbbcccdddde";
        String ans=replacecons(str);
        System.out.println(ans);
    }
    
}
