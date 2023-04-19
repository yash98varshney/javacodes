package Tree;

public class height_of_tree {
    
    public static int heightTree(TreeNode<Integer> root){
        int height=0;
        if(root==null){
            return(0);
        }

        for(int i=0;i<root.children.size();i++){
            int count1=heightTree(root.children.get(i));
            height=Math.max(height,count1);
        }
        return(height +1);
    }

    public static void main(String[] args){
        TreeNode<Integer> root=new TreeNode<Integer>(4);
        TreeNode<Integer> node1=new TreeNode<Integer>(3);
        TreeNode<Integer> node2=new TreeNode<Integer>(2);
        TreeNode<Integer> node3=new TreeNode<Integer>(1);
        TreeNode<Integer> node4=new TreeNode<Integer>(5);
        TreeNode<Integer> node5=new TreeNode<Integer>(6);
        TreeNode<Integer> node6=new TreeNode<Integer>(7);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node3.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);

        int ans=heightTree(root);
        System.out.println(ans);

    }
}
