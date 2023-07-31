package Tree;

public class number_of_nodes {

    public static int numNodes(TreeNode<Integer> root){
        int count=1;
        //this is not base case for recursion this edge case if user input null tree than came into action otherwise we never come here
    
        if(root==null){    
            return(0);
        }

        //Base case in this is for loop itself if any node does not have any child this loop will not run and return count 

        for(int i=0;i<root.children.size();i++){
            count+=numNodes(root.children.get(i));
        }
        return count;
    }


    

    public static void main(String[] args){
        TreeNode<Integer> root =new TreeNode<Integer>(3);
        int ans=numNodes(root);
        System.out.println(ans);
    }
    
}
