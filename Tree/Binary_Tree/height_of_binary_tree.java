package Tree.Binary_Tree;

public class height_of_binary_tree {
    
    public static int Heighttree(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int lefth=Heighttree(root.left);
        int righth=Heighttree(root.right);
        int ans=Math.max(lefth,righth)+1;
        return ans;
    }
}

//https://www.youtube.com/watch?v=nHMQ33LZ6oA&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=69