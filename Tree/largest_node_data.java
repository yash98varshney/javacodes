package Tree;

public class largest_node_data {

    public static int largestNode(TreeNode<Integer> root){
        //Not base case just an edge case
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int max=root.data;

        for(int i=0;i<root.children.size();i++){
            int numLargest=largestNode(root.children.get(i));
            
            if(numLargest > max){
                max=numLargest;
            }
            
        }
        return max;
    }

    public static void main(String[] args){
        
    }
    
}
