package Tree.Binary_Tree;

public class node_with_largest_data {
    
    public static int largest(BTreeNode<Integer> root){
        if(root==null){
            return -1;
        }

        int left=largest(root.left);
        int right=largest(root.right);

        return (Math.max(root.data, Math.max(right, left)));
    }
}
