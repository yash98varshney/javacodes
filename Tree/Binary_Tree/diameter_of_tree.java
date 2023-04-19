package Tree.Binary_Tree;


//2 casses will occur here where you have to count edges and where you have to count path b/w edges so in ans only difference is of +1


public class diameter_of_tree {

// method 1 this approach will take n^2 time 

    public static int height(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int lefth=height(root.left);
        int righth=height(root.right);
        int ans=Math.max(lefth,righth)+1;
        return ans;
    }

    public static int diameter(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int op1=diameter(root.left);
        int op2=diameter(root.right);
        int op3=height(root.left)+height(root.right)+1;

        int ans=Math.max(op1,Math.max(op2,op3));
        return ans;
    }


    // Method 2 :-  Using pair 

    public static Pair<Integer,Integer> Diameter(BTreeNode<Integer> root){
        if(root==null){
            Pair<Integer,Integer> p=new Pair<>();
            p.first=0;
            p.second=0;
            return p;

        }

        Pair<Integer,Integer> left=Diameter(root.left);
        Pair<Integer,Integer> right=Diameter(root.right);

        int op1=left.first;
        int op2=right.first;
        int op3=left.second + right.second +1;

        Pair<Integer,Integer> ans=new Pair<>();
        ans.first=Math.max(op1,Math.max(op2,op3));
        ans.second=Math.max(left.second,right.second)+1;

        return ans;
    }


}
