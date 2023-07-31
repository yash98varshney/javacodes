package OOD.DogDoor.Controller;

import java.util.ArrayList;
import java.util.List;

import OOD.Entities.Bark;
import OOD.ServiceLayer.BarkRecognizer;
import OOD.ServiceLayer.DogDoor;

public class DogDoorSimulator {

    public static void main(String[] args) {
        List<Bark> allowedBarksList=new ArrayList<>();
        allowedBarksList.add(new Bark("Woof"));
        DogDoor door = new DogDoor(allowedBarksList);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        System.out.println("Fido starts barking");
        recognizer.recognize(new Bark("Woof"));

        System.out.println("Fido gone outside");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }

        System.out.println("Fido all done ..");



        System.out.println("...but he's stuck outside!");

        System.out.println("Fido starts barking");
        recognizer.recognize(new Bark("Woof"));
        System.out.println("Fido's back inside...");

    }
}
