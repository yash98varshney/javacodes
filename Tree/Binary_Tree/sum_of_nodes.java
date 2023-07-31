package Tree.Binary_Tree;

public class sum_of_nodes {
    
    public static int sumofNodes(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int sumleft=sumofNodes(root.left);
        int sumright=sumofNodes(root.right);
        return (sumleft+sumright+root.data);

    }
}
