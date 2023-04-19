package OOD.Snake_and_Ladder.Entities;

public class Snake extends GameObject implements Comparable<Snake> {
 
    public Snake(Integer start, Integer end) {
        super(start, end);
    }


    @Override
    public int compareTo(Snake o) {
        return o.getEnd() - this.getEnd();
    }
}
