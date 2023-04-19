package Collectionframework;
import java.util.*;
public class LearnMap {
    public static void main(String[] args){
        Map<String,Integer> numbers =new HashMap<>();
       // Map<String,Integer> numbers2 =new TreeMap<>(); // Stores in sorted order of Keys in case of String alphabatical order is followed
        
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        //if key is already present and we again assign new value to it , this will overwrite old value.
        
        // Want value of particular key :- 

        int nad =numbers.get("One");
        System.out.println(nad);

        
        if(!numbers.containsKey("Two")){
            numbers.put("Two", 3);
        }

        System.out.println(numbers.containsValue(3));
        numbers.isEmpty();

        numbers.putIfAbsent("Two", 4); // check is present or not if not than add it.
        numbers.remove("Three"); // removes the given key and value

        //Iterate over whole key value pair
        for(Map.Entry<String,Integer> e : numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }

        // Iterate over Keys   
        for(String a: numbers.keySet()){ 
            System.out.println(a);
        }

        //Iterate over values

        for(Integer a: numbers.values()){
            System.out.println(a%2);
        }

        System.out.println(numbers);


    }
}
