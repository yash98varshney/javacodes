package OOPS.Interface_practice;

public class Customer implements Member{
    
    String name;
    public Customer(String name){
        this.name=name;
    }

    public void callback(){
        System.out.println("I will visit"+ " " +name);
        
    } 

    
}
