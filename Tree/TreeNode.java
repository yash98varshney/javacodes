package Tree;
import java.util.*;

public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data=data;
        children =new ArrayList<>();
    }
}


