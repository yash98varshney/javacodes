package Tree.Binary_Tree;

//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1#


public class balaced_Binary_tree {
    

    public static int height(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int lefth=height(root.left);
        int righth=height(root.right);
        int ans=Math.max(lefth,righth)+1;
        return ans;
    }

    // Method 1:- complexity n^2 as we are calling height on all nodes;
    public static boolean balanced(BTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        boolean left=balanced(root.left);
        boolean right=balanced(root.right);
        boolean diff=Math.abs(height(root.left)-height(root.right)) <=1;

        if(left && right && diff){
            return true;
        }
        else{
            return false;
        }
    }

    //method 2:- 

    public static Pair<Boolean,Integer> balancedTree(BTreeNode<Integer> root){
        if(root==null){
            Pair<Boolean,Integer> p=new Pair<>();
            p.first=true;
            p.second=0;

            return p;
        }

        Pair<Boolean,Integer> left=balancedTree(root.left);
        Pair<Boolean,Integer> right=balancedTree(root.right);
        
        boolean leftans=left.first;
        boolean rightans=right.first;

        boolean diff=Math.abs(left.second-right.second)<=1;

        Pair<Boolean,Integer> ans=new Pair<>();
        ans.second=Math.max(left.second,right.second)+1;

        if(leftans && rightans && diff){
            ans.first=true;
        }
        else{
            ans.first=false;
        }

        return ans;
    } 
    
}
