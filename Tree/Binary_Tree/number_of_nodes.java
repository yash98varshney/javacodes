package Tree.Binary_Tree;

public class number_of_nodes {
    
    public static int numNodes(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftcount=numNodes(root.left);
        int righcount=numNodes(root.right);
        return leftcount+righcount+1;
    }
}
