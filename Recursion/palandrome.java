package Recursion;

public class palandrome {

    public static boolean palendrome(String str,int i,int j){
        if(str.length()==0){
            return true;
        }
        
        if(i>=j){
            return(true);
        }
        if(str.charAt(i)!=str.charAt(j)){
            return(false);
        }
        else{
            boolean ans=palendrome(str, i+1, j-1);
            return(ans);    
        }
        
    }

    public static void main(String[] args){
        String str="b";
        boolean ans=palendrome(str, 0, str.length()-1);
        System.out.println(ans);
    }
    
}
