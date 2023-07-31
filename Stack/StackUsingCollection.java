//stack.push() 
//stack.pop()
//stack.peek()
//stack.isEmpty()
//stack.size()

package Stack;
import java.util.*;
public class StackUsingCollection {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<Integer>();
        int[] arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            stack.push(i);

        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
