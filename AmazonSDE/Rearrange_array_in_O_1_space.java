package AmazonSDE;

public class Rearrange_array_in_O_1_space {
    
    public static void main(String[] args){
        int[] arr={4,0,2,1,3};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int b=arr[a];

            arr[i]=a+(b%n)*n;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]/=n;
        }
        for(Integer x: arr){
            System.out.println(x);
        }
    }
}


// Placing 2 element at same position :- used in Rearrange the array in O(1) space  a=a+b*n  a,b<=n 
            //Step 1 Bind with new value using a+(b%n)*n
            //Step 2 Find new value from array a[i]/n 
            //to get new value at that index a/n + (b*n)/n
            //to get the old value from (a+b*n )%b   or a+(b%n)*n 

// https://www.youtube.com/watch?v=droGaB8jh3w