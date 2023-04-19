package OOD.ServiceLayer;

import java.util.Iterator;
import java.util.List;

import OOD.Entities.Bark;

public class BarkRecognizer {
    
    DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door=door;
    }

    public void recognize(Bark bark){
        System.out.println("BarkRecognizer Heard "+bark.getSound());
        List<Bark> allowedBarks =door.getAllowedBarsk();
        for(Iterator<Bark> i=allowedBarks.iterator();i.hasNext();){
            Bark allowedBark=(Bark)i.next();
            if(allowedBark.equals(bark)){
                door.open();
                return;
            }
        }
        System.out.println("this dog is not allowed");
    }
    
}
