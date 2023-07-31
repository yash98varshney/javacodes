package Tree.Binary_Tree;
import java.util.*;
public class practice_input {
    
    public static BTreeNode<Integer> takeinputLevelwise(){
        Scanner s=new Scanner(System.in);
        Queue<BTreeNode<Integer>> pending=new LinkedList<>();

        int rootData=s.nextInt();
        if(rootData ==-1){
            s.close();
            return null;
        }

        BTreeNode<Integer> root=new BTreeNode<Integer>(rootData);
        pending.add(root);

        while(!pending.isEmpty()){
            BTreeNode<Integer> front=pending.poll();
            int leftchild=s.nextInt();
            if(leftchild!=-1){
                BTreeNode<Integer> left=new BTreeNode<Integer>(leftchild);
                pending.add(left);
                front.left=left;
            }

            int rightchild=s.nextInt();
            if(rightchild!=-1){
                BTreeNode<Integer> right=new BTreeNode<Integer>(rightchild);
                pending.add(right);
                front.right=right;
            }
        }
        s.close();
        return root;
    }
}
