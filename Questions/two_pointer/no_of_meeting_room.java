package Questions.two_pointer;
import java.util.*;
public class no_of_meeting_room {
    
    public static int rooms(int[][] arr){
        //using priority queue so that min end time of meeting can be put on the top 
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));

        for(int[] i: arr){
            if(queue.size()==0){
                //first meeting 
                queue.add(i[1]);
            }
            else{
                if(queue.peek() > i[0]){
                    queue.add(i[1]);  //new room created 
                }
                else{
                    queue.remove();
                    queue.add(i[1]); // old room has been occupied. 
                }
            }
        }
        return(queue.size());

    }
}
//https://www.youtube.com/watch?v=NKf1OJhEZj0
