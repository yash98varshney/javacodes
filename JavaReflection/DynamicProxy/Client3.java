import java.lang.reflect.Proxy;

public class Client3 {
    
    public static void main(String[] args) {
        IVehicle c=new Car("Honda");
        ClassLoader cl=IVehicle.class.getClassLoader();
        IVehicle v=(IVehicle)Proxy.newProxyInstance(cl, new Class[] {IVehicle.class}, new VehicleHandler(c));
        v.start();
    }
}
