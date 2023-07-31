package OOD.GarryGame.Board;

import java.util.ArrayList;
import java.util.List;

import OOD.GarryGame.Units.Unit;

public class Board {

    private int height;
    private int width;
    private List<ArrayList<Integer>> tiles;

    public Board(int height,int width){
        this.height=height;
        this.width=width;
        initialize();
    }

    private void initialize(){
        tiles=new ArrayList<>();
        for(int i=0;i<width;i++){
            tiles.add(i,new ArrayList(height));
            for(int j=0;j<height;j++){
                tiles.get(i).add(j,new Tile());
            }
        }
    }

    public Tile getTile(int x,int y){
        return (Tile)(tiles.get(x-1).get(y-1));
    }

    public void addUnit(Unit unit,int x,int y){
        Tile tile=getTile(x, y);
        tile.addUnit(unit);
    }

    public void removeUnit(Unit unit, int x,int y){
        Tile tile=getTile(x, y);
        tile.removeUnit(unit);
    }

    public void removeUnits(int x,int y){
        Tile tile=getTile(x,y);
        tile.removeUnits();
    }

    public List getUnits(int x,int y){
        return getTile(x,y).getUnits();
    }
    

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<ArrayList<Integer>> getTiles() {
        return tiles;
    }

    public void setTiles(List<ArrayList<Integer>> tiles) {
        this.tiles = tiles;
    }




}
