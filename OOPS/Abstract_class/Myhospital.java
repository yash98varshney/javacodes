package OOPS.Abstract_class;

public class Myhospital extends hospital {
    public Myhospital(){
        System.out.println("child constructor");
    }
    @Override
    public void emergency(){
        System.out.println("override evergency");
    }

    @Override
    public void admit(){
        System.out.println("override admit");
    }

    @Override
    public void appointment(){
        System.out.println("override appointment");
    }

    @Override
    public void billing(){
        System.out.println("override billing");
    }

    public static void main(String[] args){
        Myhospital c=new Myhospital();
        c.appointment();
    }
}
