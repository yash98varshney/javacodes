package Design_Patterns.Prototype_Design_pattern;

public class SwordsMan extends GameUnit{
    
    private String state="idle";

    public void attack(){
        this.state="attacking";
    }

    @Override
    public String toString(){
        return "SwordsMan"+state+" @ "+getPosition();
    }
}
