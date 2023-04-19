package Collectionframework;
import java.util.*;
public class LearStack {
    public static void main(String[] args){
        Stack<String> animals=new Stack<>();
        animals.push("Lion");
        animals.push("Hen");
        animals.push("Elephant");
        System.out.println(animals);

       String s= animals.peek();
       System.out.println(s);
        animals.pop();
        
    }
}
