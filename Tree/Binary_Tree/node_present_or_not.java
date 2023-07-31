package Tree.Binary_Tree;

public class node_present_or_not {
    
    public static boolean present(BTreeNode<Integer> root,int k,boolean ans){
        if(root==null){
            return false;
        }
        if(root.data==k){
            ans=true;
            return true;
        }
        else{
            ans=false;
        }
        boolean left=present(root.left, k,ans);
        boolean right=present(root.right,k,ans);
        if(left || right){
            return true;
        }
        else{
            return false;
        }
    }
}
