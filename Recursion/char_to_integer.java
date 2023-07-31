package Recursion;



//need to convert "2032" to int 2032

public class char_to_integer {
    
    public static int Inte(String str){
        
        if(str.length()==0){
            return 0;
        }
        int ans=Inte(str.substring(1));
        return((str.charAt(0)-'0')*(int)Math.pow(10,str.length()-1) + ans);


    }

    public static void main(String[] args){
        String str="244556677";
        int ans=Inte(str);
        System.out.println(ans);
    }
}
