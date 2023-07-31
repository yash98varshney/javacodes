package Questions;

public class Reverse_words_in_sen {
    
    public static String rev(String s){
        int i=0;
        int n=s.length();
        int j=0;
        String temp="";
        String result="";

        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            if(i>=n){
                break;
            }
            while(j<n && s.charAt(j)!=' '){
                j++;
            }
            temp=s.substring(i,j);
            result=temp+result;
            i=j+1;
        }
        return(result);
    }
}
