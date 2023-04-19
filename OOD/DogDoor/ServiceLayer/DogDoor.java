package OOD.ServiceLayer;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import OOD.Entities.Bark;

public class DogDoor {
    
    boolean open=false;
    private List<Bark> allowedBarsk;

    public DogDoor(List<Bark> allowedBark){
        this.allowedBarsk=allowedBark;
    }

    public void open(){
        System.out.println("The dog Door opens");
        open=true;

        final Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            public void run(){
                close();
                timer.cancel();
            }
        } ,5000 );
    }

    public void close(){
        System.out.println("The dog door closes");
        open=false;
    }

    public boolean isopen(){
        return open;
    }


    public List<Bark> getAllowedBarsk() {
        return allowedBarsk;
    }

    public void setAllowedBarsk(List<Bark> allowedBarsk) {
        this.allowedBarsk = allowedBarsk;
    }


}
