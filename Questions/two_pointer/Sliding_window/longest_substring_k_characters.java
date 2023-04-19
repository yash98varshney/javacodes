package Questions.two_pointer.Sliding_window;

import java.util.HashMap;

public class longest_substring_k_characters {
    
    public static int countSubstring(String str,int k,int n){
        int i=0;
        int j=0;
        int max_length=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;

        while(j<n){
            if(!map.containsKey(str.charAt(j))){
                map.put(str.charAt(j),1);
                count++;
            }
            else{
                map.put(str.charAt(j),map.get(str.charAt(j))+1);
            }

            if(count <k){
                max_length=Math.max(max_length, j-i+1);
                j++;
            }
            else if(count ==k){
                if(j-i+1>max_length){
                    max_length=j-i+1;
                }
                j++;
            }
            else if(count>k){
                while(count >k && i<n){
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==0){
                        map.remove(str.charAt(i));
                        count--;
                    }
                    i++;
                }
                j++;
            }
        }
        return(max_length);
    }

    public static void main(String[] args){
        String str="abcadcacacaca";
        int ans=countSubstring(str, 3, str.length());
        System.out.println(ans);
    }
}
