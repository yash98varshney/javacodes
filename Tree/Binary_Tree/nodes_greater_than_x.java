package Tree.Binary_Tree;

public class nodes_greater_than_x {
    
    public static int countnodes(BTreeNode<Integer> root, int k,int count){
        if(root==null){
            return 0;
        }

        int left=countnodes(root.left,k,count);
        
        int right=countnodes(root.right,k, count);
        if(root.data>k){
            System.out.println(root.data);
            count++;
        }
        return count+left+right;

    }
}
