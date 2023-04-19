package Design_Patterns.Prototype_Design_pattern;

public class GameUnit implements Cloneable {
    
    private Point3D position;

    public GameUnit(){
        position=Point3D.ZERO;
    }

    public GameUnit(float x,float y,float z){
        position=new Point3D(x,y,z);
    }

    public void move(Point3D direction,float distance){
        Point3D finalMove=direction.normalize();
        finalMove=finalMove.multiply(distance);
        position=position.add(finalMove);
    }

    public Point3D getPosition(){
        return position;
    }

    public GameUnit clone() throws CloneNotSupportedException{
        GameUnit unit=(GameUnit)super.clone(); //Shalow copy 
    }
 }
