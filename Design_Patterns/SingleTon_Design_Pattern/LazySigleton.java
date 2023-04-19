package Design_Patterns.SingleTon_Design_Pattern;

public class LazySigleton {
    
    private LazySigleton(){

    }

    private static volatile LazySigleton instance;   //Voilatile is used to always force Threads to take value of instance from Main memeory only not from the cached memory

    public static LazySigleton getInstance(){
        if(instance==null){
            synchronized(LazySigleton.class){     // Sysnchronized is used because multiple threads can try to acess the instance varaible which creates different object of class.
                if(instance==null){
                    instance=new LazySigleton();
                }
            }
        }
        return instance;
    }
}
