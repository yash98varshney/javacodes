package Collectionframework;
import java.util.*;
public class LearArrayDeque {
    public static void main(String[] args){
        //Array Deque(Dack) it is a spetial type of queue in which we can add and remove element from both side and also we can peek from both side.
        //Sliding window technique m use hota h 
        ArrayDeque<Integer> adq=new ArrayDeque<>(); // this is also implementing queue so all queue functions can be used over here.

        adq.offer(1);
        adq.offerFirst(2); // add element at first of the queue
        adq.offerLast(5); //add element at the last of the queue 

        adq.poll();
        adq.pollFirst();
        adq.pollLast();
        adq.peek();
        adq.peekLast();
        adq.peekFirst();

        // we can implement Stack using this Array Deque just we have to use pollLast();

    }
}
