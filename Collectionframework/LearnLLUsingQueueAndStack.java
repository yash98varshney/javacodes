package Collectionframework;
import java.util.*;
public class LearnLLUsingQueueAndStack {
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();  //Linked list is implementing queue interface.
        queue.offer(12);
        queue.offer(34);
        queue.offer(36);  // add element to the end of the queue
        queue.poll(); // remove first element from the queue and return it's value 
        queue.peek();
        
    }
}
