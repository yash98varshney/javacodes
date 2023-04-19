package OOPS.Inner_class;

abstract class My{
    abstract public void display();
}

class Outer{

    public void meth(){
        My m=new My(){
            @Override
            public void display(){
                System.out.println("Hello");    // this is a anonymous class as we have created it at the time of object creation.
                // complier will create a anonymous class and it's object is created and it's refrence is m

            }
        };

        m.display();  // Hello is printed;
    }
}

public class Anonymous_inner{
    public static void main(String[] args){
        Outer o=new Outer();
        o.meth();

    }
}
