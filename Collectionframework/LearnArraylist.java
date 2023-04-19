package Collectionframework;
import java.util.*;
public class LearnArraylist {
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1,20);  //add at particular index
        List<Integer> arr2=new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.addAll(arr2); // add all the element of arr2 in the end.
        arr.remove(3);// remove at this particular index
        arr.remove(Integer.valueOf(4)); // this will remove 4 from array if present 
        arr.set(2,70);  // set any particular index 
        arr.size();
        Collections.max(arr);

        arr.contains(70); // will give true if present otherwise false
        int ans=arr.get(2);  // get any thing at any Index.

        //Iterate over list

        //Using simple for loop 

        for(int i=0;i<arr.size();i++){
            System.out.print(i+" ");
        }

        //Using for each loop

        for(Integer i: arr){
            System.out.print(i+ " ");
        }

        arr.forEach(e -> {
            System.out.println(e);
        });

        //Using Iterator

        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(ans);
        System.out.println(arr);

        boolean[] check=new boolean[2];
        check[1]=true;
        for(int i=0;i<check.length;i++){
            System.out.println(check[i]);
        }





    }

    



    
    

}
