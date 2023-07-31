package OOD.Snake_and_Ladder.Entities;

public abstract class GameObject {
    Integer start;
    Integer end;

    public GameObject(Integer start,Integer end){
        this.start=start;
        this.end=end;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }

    
}
