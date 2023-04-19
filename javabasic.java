import java.util.*;
public class javabasic {

    // pass variable arguments in function
    //variable argument is always the last one to pass 

    public void show(int ... x){
        System.out.println(x); 
    }

    public void show(int y,int ... x){
        System.out.println(x); 
    }


    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        String[] arr=str.split(" ");
        ArrayList<String> newarr=new ArrayList<>();

        for(String i:arr){
           newarr.add(i);
        }
        Collections.sort(newarr);
        System.out.println(newarr);
       // Iterator<String> it=new arr.iterator();

        s.close();

    }
}
