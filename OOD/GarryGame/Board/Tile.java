package OOD.GarryGame.Board;

import java.util.LinkedList;
import java.util.List;

import OOD.GarryGame.Units.Unit;

public class Tile {
    
    private List<Unit> units;

    public Tile(){
        units=new LinkedList<>();
    }

    protected void addUnit(Unit unit){
        units.add(unit);
    }

    protected void removeUnit(Unit unit){
        units.remove(unit);
    }

    protected void removeUnits()
    {
        
    }

    protected List getUnits()
    {
        return units;
    }
}
