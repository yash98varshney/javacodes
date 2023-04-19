package OOD.Entities;

import OOD.ServiceLayer.DogDoor;

public class Remote {
    DogDoor door;

    public Remote(DogDoor door){
        this.door=door;
    }
    public void pressButton(){
        System.out.println("Pressing the remote control button ...");
        if(door.isopen()){
            door.close();
        }
        else{
            door.open();
        }
    }
}
