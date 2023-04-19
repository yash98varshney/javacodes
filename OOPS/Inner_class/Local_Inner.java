package OOPS.Inner_class;

abstract class check{                    // we can use interface also in this place 
    abstract public void show2();
}

class ABC{

    public void display2(){
        check c=new check(){
            public void show2(){
                System.out.println("this is show 2");
            }
        };
        c.show2();
    }
    public void display(){
        class Inner{
            public void show(){
               System.out.println("this is show ");
            }
        }
        // Inner i=new Inner();
        // i.show();
        new Inner().show();
    }
}
public class Local_Inner {
    public static void main(String[] args){
        ABC o=new ABC();
        o.display();
        o.display2();
    }
}
