package Questions.two_pointer.Sliding_window;
import java.util.*;

public class printfirst_negative_number {
    
    public static void negativenumber(int[] arr,int n,int k){
        int i=0;
        int j=0;
        Queue<Integer> queue=new LinkedList<>();

        while(j<n){
            if(arr[j]<0){
                queue.add(arr[j]);
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(queue.size()!=0){
                    System.out.print(queue.peek()+" ");
                    if(arr[i]==queue.peek()){
                        queue.poll();
                        

                    }
                    
                }
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args){
        int[] arr={};
        negativenumber(arr, 0, 3);

    }
}
