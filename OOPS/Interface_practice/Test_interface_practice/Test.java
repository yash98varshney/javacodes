package OOPS.Interface_practice.Test_interface_practice;

interface Test {
    // Can make variables which are called identifiers and they are final static by default we can write it or not 

    final static int Hello=10;

    public void meth1();
    public void meth2();

    //Default and static methods can be made in Interface and those have method body

    default void meth4(){
        System.out.println("Default meth 4 ");
    }

    public static void meth5(){
        System.out.println("Static meth5");
    }

    //From java 9 private methods are also allowed in Interface and they are used by default methods 

    private void meth6(){
        System.out.println("Private meth6");
    }

    default void meth7(){
        meth6();
    }
}
 
