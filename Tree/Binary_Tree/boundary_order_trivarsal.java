package Tree.Binary_Tree;
import java.util.*;

/*
3 parts h 
left part print excluding leaf node 
print all leaf node 
right part print excluding leaf node and in reverse order 
*/

public class boundary_order_trivarsal {

    
    // printitng left part 
    public static void traversalLeft(BTreeNode<Integer> root , ArrayList<Integer> ans){
        if((root==null) || (root.left==null && root.right==null)){
            return;
        }
        
        ans.add(root.data);
        if(root.left!=null){
            traversalLeft(root.left,ans);
        }
        else{
            traversalLeft(root.right,ans);
        }
        
    }
    

    // printing leaf nodes 
    public static void traversalLeaf(BTreeNode<Integer> root , ArrayList<Integer> ans){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            ans.add(root.data);
            return;
        }
        
        traversalLeaf(root.left,ans);
        traversalLeaf(root.right,ans);
        
    }
    

    // printing rigth part 
    public static void traversalRight(BTreeNode<Integer> root,ArrayList<Integer> ans){
        if((root==null) || (root.left==null && root.right==null)){
            return ;
        }
        
        if(root.right!=null){
            traversalRight(root.right,ans);
            
        }
        else{
            traversalRight(root.left,ans);
        }
        ans.add(root.data);
    }
    
	ArrayList<Integer> boundary(BTreeNode<Integer> root)
	{
	    ArrayList<Integer> ans=new ArrayList<>();
	    if (root==null){
	        return ans;
	    }
	    ans.add(root.data);
	    
        // left part 
	    traversalLeft(root.left,ans);
        //leaf from left
	    traversalLeaf(root.left,ans);
        //leaf from right
	    traversalLeaf(root.right,ans);
        //right part
	    traversalRight(root.right,ans);
	    
	    return(ans);
	}
	
    
}
