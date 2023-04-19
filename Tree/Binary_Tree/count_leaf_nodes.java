package Tree.Binary_Tree;

import java.util.Stack;

public class count_leaf_nodes {
    
    public static int countNodes(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        Stack<BTreeNode<Integer>> stack=new Stack<>();
        stack.push(root);
        int count=0;

        while(!stack.isEmpty()){
            BTreeNode<Integer> pending=stack.pop();
            if(pending.left!=null){
                stack.push(pending.left);
            }
            if(pending.right!=null){
                stack.push(pending.right);
            }
            if(pending.right==null && pending.left==null){
                count++;
            }

        }
        return count;
    }

    // Method 2 

    public static int CountNodes(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        if(root.left!=null && root.right!=null){
            return 1;
        }

        int count=0;
        int ans=CountNodes(root.left);
        count=count+ans;
        ans=CountNodes(root.right);
        count=count+ans;

        return count;
    }

    //Method3 

    public static void CountNode(BTreeNode<Integer> root,int count){
        
        if(root==null){
            return;
        }
        CountNode(root.left,count);
        if(root.left==null && root.right==null){
            count++;
        }
        CountNode(root.right, count);
    }
    
}
