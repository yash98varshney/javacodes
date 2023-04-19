package OOD.Snake_and_Ladder.Entities;

public class Ladder extends GameObject implements Comparable<Ladder> {
    public Ladder(Integer start, Integer end) {
        super(start, end);
    }


    @Override
    public int compareTo(Ladder o) {
        return this.getStart() - o.getStart();
    }
}