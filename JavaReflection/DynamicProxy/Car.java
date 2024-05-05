public class Car implements IVehicle {
    
    private String name;

    public Car(String name){
        this.name=name;
    }
    @Override
    public void start(){
        System.out.println("Car started");
    }
}
