// find count of all anagrams in the given string 
// substring = pattern given 
// k=size of pattern 
// String = main string 
//So we can use sliding window concept here 

package Questions.two_pointer.Sliding_window;
import java.util.*;

public class count_anagram {
    
    public static int anagramcount(String str, String pattern){
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int start=0;
        int end=0;
        int ans=0;
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), 1);
            }
            else{
                int p=map.get(pattern.charAt(i))+1;
                map.put(pattern.charAt(i),p);
            }
        }
        count=map.size();

        while(end<str.length()){
            
            // Initial calculations 
            if(map.containsKey(str.charAt(end))){
                int p=map.get(str.charAt(end))-1;
                map.put(str.charAt(end),p);

                if(p==0){
                    count--;
                }
            }
            
            // Condition 1 

            if(end-start+1<pattern.length()){
                end++;
            }
            else if(end - start +1 == pattern.length() ){
                
                // ans from 2nd calculation 

                if(count==0){
                    ans++;
                }

                // calculation for i/start characte to remove
                
                if(map.containsKey(str.charAt(start))){
                    int p=map.get(str.charAt(start))+1;
                    map.put(str.charAt(start),p);

                    if(p==1){
                        count++;
                    }
                }
                // Incrementing start and end 

                start++;
                end++;
            }
        }
        return(ans);



    }

    public static void main(String[] args){
        String str="aaba";
        String pattern="ab";
        int ans=anagramcount(str, pattern);

        System.out.println(ans);
    }
}
