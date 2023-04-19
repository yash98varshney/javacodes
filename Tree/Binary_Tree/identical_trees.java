package Tree.Binary_Tree;

public class identical_trees {
    
    public static boolean Identical(BTreeNode<Integer> root1,BTreeNode<Integer> root2){

        if(root1==null && root2==null){
	        return true;
	    }
	    if(root1!=null && root2==null){
	        return false;
	    }
	    if(root1==null && root2!=null){
	        return false;
	    }
	    
	    boolean left=Identical(root1.left,root2.left);
	    boolean right =Identical(root1.right,root2.right);
	    
	    boolean val=root1.data==root2.data;
	    
	    if(left && right && val){
	        return true;
	    }
	    else{
	        return false;
	    }
    }
}
