import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class VehicleHandler implements InvocationHandler{
    
    private IVehicle v;
    
    public VehicleHandler(IVehicle v){
        this.v=v;
    }

    @Override
    public Object invoke(Object proxy,Method m,Object[] args) throws Throwable{
        System.out.println("Vehicle handler : Invoking "+m.getName());
        return m.invoke(v, args);
    }
}
