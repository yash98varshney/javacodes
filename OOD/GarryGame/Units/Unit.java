package OOD.GarryGame.Units;

import java.util.HashMap;

public class Unit {


    private String type;
    private HashMap properties;
    
    public Unit(){

    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashMap getProperties() {
        return properties;
    }

    public void setProperties(HashMap properties) {
        this.properties = properties;
    }


}
