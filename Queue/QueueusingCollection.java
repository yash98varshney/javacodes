package Queue;
import java.util.*;
public class QueueusingCollection {
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);  // same as enqueue
        queue.add(20);
        queue.poll(); //to remove same as dequeue
        queue.size(); // size of queue
        queue.peek(); // to see first element same as front 

    }


    
}
