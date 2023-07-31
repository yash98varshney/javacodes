package Questions;

// find number of prime numbers from 0-n 
// 1. make bolean araaylist and set all the value to true means all number are prime initially
// 2. set 0 and 1 as false as they are not prime 
// 3. if value at index is true than it is prime so make all the multiple of that number as false like 7 is true make 14,21,28 ... etc false
// 4. Increment count ... 

import java.util.*;
public class Sieves_of_Erotinies {
    public static int checkprime(int n){
        int count=0;
        ArrayList<Boolean> prime=new ArrayList<Boolean>(Collections.nCopies(n+1,true));
    
        prime.set(0,false);
        prime.set(1,false);
    
        for(int i=2;i<n;i++){    // looping till number 
          if(prime.get(i)){      // chcking for prime if true to in other wise out 
            count++;
            for(int j=2*i;j<n;j=j+i){   //making all the multiple of I false
              prime.set(j,false);
            }
          }
        }
        return count;  // returning count 
      }

      public static ArrayList<Integer> sieveOfEratosthenes(int n){
        ArrayList<Boolean> prime=new ArrayList<>(Collections.nCopies(n+1,true));
        ArrayList<Integer> ans=new ArrayList<>();
        
        prime.set(0,false);
        prime.set(1,false);
        
        for(int i=2;i*i<=n;i++){
            if(prime.get(i)){
                //ans.add(i);
                for(int j=2*i;j<=n;j=j+i){
                    prime.set(j,false);
                }
            }
        }
        
        for(int i=2;i<=n;i++){
            if(prime.get(i)){
                ans.add(i);
            }
        }
        return(ans);
    }
      public static void main(String[] args) {
        int n=20;
        int ans=checkprime(n);
        System.out.println(ans);
    
      }
}
