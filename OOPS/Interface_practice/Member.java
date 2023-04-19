package OOPS.Interface_practice;

interface Member {
   
    void callback();
    default  void calculate_o(){
        System.out.println("Hello Printing default");
    }

}

