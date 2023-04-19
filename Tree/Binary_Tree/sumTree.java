package Tree.Binary_Tree;

//import javax.print.DocFlavor.BYTE_ARRAY;

public class sumTree {
    
    public static Pair<Boolean,Integer> isSumTree(BTreeNode<Integer>root ){
        if(root==null){
            Pair<Boolean,Integer> p=new Pair<>();
            p.first=true;
            p.second=0;
            return p;
        }

        if(root.left==null && root.right==null){
            Pair<Boolean,Integer> p=new Pair<>();
            p.first=true;
            p.second=root.data;
            return p;
        }

        Pair<Boolean,Integer> leftans=isSumTree(root.left);
        Pair<Boolean,Integer> rightans=isSumTree(root.right);

        boolean left=leftans.first;
        boolean right=rightans.first;

        boolean condition=root.data==leftans.second+rightans.second;

        Pair<Boolean,Integer> ans=new Pair<>();

        if(left && right && condition){
            ans.first=true;
            ans.second=2*root.data;
        }
        else{
            ans.first=false;

        }
        return ans;



    } 
}
