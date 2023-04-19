package Design_Patterns.SingleTon_Design_Pattern;

public class EagerSingleton {
    
    private EagerSingleton(){

    }

    final private static  EagerSingleton instance =new EagerSingleton();

    private static EagerSingleton getInstance(){
        return instance;
    }
}
