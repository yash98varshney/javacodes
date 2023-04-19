package Queue;

public class Queueuse {
    public static void main(String[] args) throws QueueFullException{
        QueueusingArray queue=new QueueusingArray(3);
        for(int i=0;i<3;i++){
            try{
                queue.enqueue(i);
            }
            catch(QueueFullException e){

            }
        }
        while(! queue.isEmpty()){
            try{
                System.out.println(queue.dequeue());
            }catch(QueueEmptyException e){
            }
        }
    }
}
