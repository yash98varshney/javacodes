package Collectionframework;
import java.util.*;
public class LearnHashset {
    public static void main(String[] args){
        //Follows property of Set means no duplicate elements are present 
        //order may change if we print it.
        Set<Integer> set=new HashSet<>();
        //Set<Integer> set2=new  LinkedHashSet<>(); // in this linked list is used in backend so order of elements are maintained
        //Set<Integer> set3=new TreeSet<>(); // BST is used in backend so elements are sorted automatically
        set.add(1);
        set.add(12);
        set.add(90);
        set.add(50); 
        set.remove(12);
        set.contains(100);
        set.isEmpty();
        set.size();
        set.clear();

        
    }
}
