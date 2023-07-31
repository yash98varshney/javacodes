package Questions.two_pointer.Sliding_window;

import java.util.*;

public class removePermutation {
    
    public void remove_all_perm(String str,String pattern){
        int plength=pattern.length();
        int i=0;
        int j=0;
        HashMap<Character,Integer> patternmap=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int k=0;k<plength;k++){
            if(patternmap.containsKey(pattern.charAt(k))){
                patternmap.put(pattern.charAt(k),patternmap.get(pattern.charAt(k))+1);
            }
            else{
                patternmap.put(pattern.charAt(k),1);
            }
        }

        while(j<str.length()){
            if(!map2.containsKey(str.charAt(j))){
                map2.put(str.charAt(j),1);
            }
            else{
                map2.put(str.charAt(j),map2.get(str.charAt(j))+1);
            }

            if(j-i+1<plength){
                j++;
            }

            if(j-i+1==plength){
                for(int l=0;i<j-i+1;l++){
                    System.out.println(l);
                }
            }
        }

        
    }
}
