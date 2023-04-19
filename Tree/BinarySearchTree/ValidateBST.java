package Tree.BinarySearchTree;


//Given Tree validate whether it is BST or not

public class ValidateBST {
    
    public boolean validateBST(TreeNode root){
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean helper(TreeNode root,int min,int max){

        if(root==null){
            return true;
        }

        boolean a=helper(root.left,Integer.MIN_VALUE,root.data);
        boolean b=helper(root.right,root.data,Integer.MAX_VALUE);

        if(a==true && b==true && (root.data>=min && root.data<=max)){
            return true;
        }
        else{
            return false;
        }

    }
}
