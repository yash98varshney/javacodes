package Recursion;

public class Remove_char_from_String {

    //Logic 1 
    public static String remove(String s,int i){
        String ns=new String();
        if(i==s.length()){
            return(ns);
        }
        String ans="";
        if(s.charAt(i)!='x'){
            ans=ans+s.charAt(i);
        }
        String result=remove(s,i+1);

        return(ans+result);
    }

    //Logic 2
    
    public static String removeX(String str){
        if(str.length()==0){
            return(str);
        }
        String ans="";
        if(str.charAt(0)!='x'){
            ans=ans+str.charAt(0);
        }
        String smallAns=removeX(str.substring(1));
        return(ans+smallAns);
    }

    public static void main(String[] args){
        String s="xaxcxdxgv";
        String ans=remove(s,0);
        System.out.println(ans);
    }
}
