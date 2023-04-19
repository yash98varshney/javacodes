package Tree.Binary_Tree;

public class remove_leaf_node {
    
    public static BTreeNode<Integer> remove_leaf(BTreeNode<Integer> root){

        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return null;
        }

        root.left=remove_leaf(root.left);
        root.right=remove_leaf(root.right);
        return root;
    } 
}
