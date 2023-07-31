package OOPS.Inheritance_practice;

public class Question {
    private String question;
    private String answer;
    
    public Question(){
        
    }

    public Question(String question){
        this.question=question;
        this.answer="";
    }

    public void setQuestion(String question){
        this.question=question;
    }

    public String getQuestion(){
        return this.question;
    }

    public void setAnswer(String answer){
        this.answer=answer;
    }

    public String getAnswer(){
        return this.answer;
    }

    public boolean checkAnswer(final String ans){
        return ans.equals(this.answer);
    }

    public void display(){
        System.out.println(this.question);
    }



}
