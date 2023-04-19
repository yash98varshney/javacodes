package Questions;
import java.util.*;
public class AbsolutedifferenceHeap {
    public static void main(String[] args){
        int[] arr1={2,1,11,13,7};
        int n=arr1.length;
        PriorityQueue<Integer> arr=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            arr.offer(arr1[i]);
        }
        int count=n-1;
        while(count>0){
            int top1=arr.poll();
            int top2=arr.poll();
            int diff=top1-top2;
            arr.offer(diff);
            System.out.println(arr);
            count--;
        }
        System.out.println(arr.peek());

      



    }


    
    


}
