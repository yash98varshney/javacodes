import java.util.*;

class Player implements Comparable<Player>{
    String name;
    int age;
    int ranking;
    
    public Player(String name,int age,int ranking){
        this.name=name;
        this.age=age;
        this.ranking=ranking;
    }
    @Override
    public int compareTo(Player othPlayer){
        //Player othPlayer=(Player)o;
        if(this.ranking>othPlayer.ranking){
            return 1;
        }
        else if(this.ranking<othPlayer.ranking){
            return -1;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return this.name;
    }

}


public class Comparabledemo {

    public static void main(String[] args){
        List<Player> arr=new ArrayList<>();
        arr.add(new Player("John",24,20));
        arr.add(new Player("Roger", 67, 26));
        arr.add(new Player("Steven",45,24));
        //Using comparable 
        //Collections.sort(arr,Collections.reverseOrder());

        //Using Comparator sort in acending order 

        arr.sort(
            (Player p1,Player p2)-> {
                if(p1.ranking>p2.ranking){
                    return 1;
                }
                else if(p1.ranking<p2.ranking){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        );

        System.out.println(arr);
    }
    
}
