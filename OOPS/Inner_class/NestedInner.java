package OOPS.Inner_class;

class Outer1 {
    
    static int x=10;  // we can also make this variable as static and it's still accessible by inner class 
    Inner i=new Inner();
    class Inner{
        int y=20;

        public void innerDisplay(){
            System.out.println(x+" "+ y);
        }
    }

    public void outerdisplay(){
        Inner i=new Inner();   // we can do both we can make object in method as well as in outer class so it will be available for all methods
        i.innerDisplay();
        System.out.println(i.y);

    }
}

public class NestedInner{
    public static void main(String[] args){
        Outer1 o=new Outer1();
        o.outerdisplay();

        Outer1.Inner oi=new Outer1().new Inner();
        oi.innerDisplay();
    }
}
