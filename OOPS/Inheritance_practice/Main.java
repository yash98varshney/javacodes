package OOPS.Inheritance_practice;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Question q = new Question();
        q.setQuestion("Who invented AC Current?");
        q.setAnswer("Nikola Tesla");
        q.display();
        System.out.print("Your answer:");
        String response =in.nextLine();
        System.out.println(q.checkAnswer(response));
        in.close();
        
        
    }
    
}
