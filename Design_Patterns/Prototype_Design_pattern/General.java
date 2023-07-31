package Design_Patterns.Prototype_Design_pattern;

public class General extends GameUnit {
    
    public String state="idle";

    public void boostMoral(){
        this.state="MoralBoost";
    }

    @Override
    public String toString(){
        return "General"+state+" @"+getPosition();
    }
}
