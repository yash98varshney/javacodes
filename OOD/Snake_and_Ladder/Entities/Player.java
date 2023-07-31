package OOD.Snake_and_Ladder.Entities;

public class Player {
    
    Integer id;
    String name;
    Integer pawenPosition;
    Boolean gameOver;

    public Player(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPawenPosition() {
        return pawenPosition;
    }

    public void setPawenPosition(Integer pawenPosition) {
        this.pawenPosition = pawenPosition;
    }

    public Boolean getGanmeOver() {
        return gameOver;
    }

    public void setGanmeOver(Boolean ganmeOver) {
        this.gameOver = ganmeOver;
    }

    

}
