package Recursion;

public class replace_char_inString {

    public static String replace(String str, char c1, char c2){
        if(str.length()==0){
            return(str);
        }
        String ans="";
        if(str.charAt(0)==c1){
            ans=ans+c2;
        }
        else{
            ans=ans+str.charAt(0);
        }

        String result=replace(str.substring(1),c1,c2);
        return(ans+result);

    }

    public static void main(String[] args){
        String s="antdtfght";
        String ans=replace(s,'t','0');
        System.out.println(ans);

    }
    
}
