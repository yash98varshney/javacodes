package Collectionframework;
import java.util.*;
public class LearnPriorityQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(); //Priority queue is implementing Queue interface so Queue methods will work 
       // PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity);
        //implementing min heap in this case
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.poll();
        pq.peek();
        System.out.println(pq);

        PriorityQueue<Integer> pq2=new PriorityQueue<>(7,Comparator.reverseOrder()); // this will create max heap
        pq2.offer(40);
        pq2.offer(12);
        pq2.offer(24);
        pq2.offer(36);
        System.out.println(pq2);
        System.out.println(pq2.isEmpty());
    }
}
