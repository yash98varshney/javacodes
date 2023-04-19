package Recursion;
//We have to replace Pi =3.14 in a string and return that string 

public class replace_pi_String {
    
    public static String replace(String str,int i){
        String s="";
        if(i==str.length()){
            return("");
        }

        if(str.charAt(i)=='p' && str.charAt(i+1)=='i'){
            i++;
            s=s+"3.14";
        }
        else{
            s=s+str.charAt(i);
        }

        String ans=replace(str, i+1);
        return(s+ans);

    }

    public static String replace2(String str){
        String out="";
        if(str.length()<=1){
            return(str);
        }
        String small=replace2(str.substring(1));
        if(str.charAt(0)=='p' && small.charAt(0)=='i'){
            out="3.14"+small.substring(1);
        }
        else{
            out=str.charAt(0)+small;
        }
        return(out);
    }

    public static void main(String[] args){
        String str="pipipixxx";
        String ans=replace2(str);
        System.out.println(ans);
    }
}
