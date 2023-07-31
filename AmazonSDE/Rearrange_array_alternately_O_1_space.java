package AmazonSDE;

public class Rearrange_array_alternately_O_1_space {
    
    public static void rearrange(long arr[], int n){
        
        // Your code here
        
        int max_index=n-1;
        int min_index=0;
        long maxnum=arr[n-1]+1;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[max_index]%maxnum)*maxnum;
                max_index--;
            }
            else{
                arr[i]=arr[i]+(arr[min_index]%maxnum)*maxnum;
                min_index++;
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i]/=maxnum;
        }
        
    }
}

// Placing 2 element at same position :- used in Rearrange the array in O(1) space  a=a+b*n  a,b<=n 
            //Step 1 Bind with new value using a+(b%n)*n
            //Step 2 Find new value from array a[i]/n 
            //to get new value at that index a/n + (b*n)/n
            //to get the old value from (a+b*n )%b   or a+(b%n)*n 

//https://www.youtube.com/watch?v=kQrezgskpho