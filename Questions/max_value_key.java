package Questions;
import java.util.*;
public class max_value_key {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        String a="saaaaaa";
        System.out.println((int)a.charAt(0));
        map.put("Helo",10);
        map.put("H",30);
        map.put("Hel",50);
        map.put("Hell",60);
        for(String s:map.keySet()){
            System.out.println(map.get(s));
        }
        
        String f="s";
        System.out.println((int)f.charAt(0));

    }
}
