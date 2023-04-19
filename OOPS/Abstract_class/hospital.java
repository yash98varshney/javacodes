package OOPS.Abstract_class;

public abstract class hospital {
    
    public hospital(){
        System.out.println("parent constuctor");
    }

    abstract public void emergency();
    abstract public void appointment();
    abstract public void admit();
    abstract public void billing();

}
