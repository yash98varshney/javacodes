package OOPS.Inheritance_practice;
import java.util.*;
public class MultipleChoiceQuestion extends Question{
    private ArrayList<String> choices =new ArrayList<>();

    public MultipleChoiceQuestion(ArrayList<String> choices){
        super();
        this.choices=choices;

    }

    public void addChoice(String choice, boolean correct){
        this.choices.add(choice);
        if(correct==true){
            //this.answer=choice;
            setAnswer(choice);
        }
    }
    

    @Override
    public void display(){
        System.out.println(getQuestion());
        for(String s:choices){
            System.out.println(s);
        }
    }

}
