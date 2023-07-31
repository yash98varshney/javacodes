package AmazonSDE;
import java.util.*;
public class Find_duplicate_in_an_array {
    
    public static int[] duplicates(int[] arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                int index=Math.abs(arr[i]);
                if(arr[index]!=0){
                    if(arr[index]>0){
                        arr[index]=arr[index]*-1;
                    }
                    else{
                        ans.add(index);
                    }
                }
                else{
                    if(arr[index]!=Integer.MIN_VALUE){
                        arr[index]=Integer.MIN_VALUE;
                    }
                    else{
                        arr[index]=0;
                    }
                    
                }
                
            }
            else{
                arr[0]=arr[0]*-1;
            }
            
        }
        
        return arr;
    }

    public static void main(String[] args){
        int[] arr={2,3,1,2,3};
        int[] ans=duplicates(arr, 5);
        for(Integer x:ans){
            System.out.println(x);
        }
    }
}

// not aplicable for values repeating more than 2 times 
// than we have to use array of length n and count the occurence of elements 


//Two -3 pointer approach 
//Slow and fast pointer same as Linked List 
// Prfix suffix sum/multipliacton
// Sliding window 
// Max/Min till now min till now arrays 
// Taking array as extra space of size n 
//Sort array 
//Binary search 
//Allocation Problems concept
// Placing 2 element at same position :- used in Rearrange the array in O(1) space  a=a+b*n  a,b<=n 
            //Step 1 Bind with new value using a+(b%n)*n
            //Step 2 Find new value from array a[i]/n 
            //to get new value at that index a/n + (b*n)/n
            //to get the old value from (a+b*n )%b   or a+(b%n)*n    






