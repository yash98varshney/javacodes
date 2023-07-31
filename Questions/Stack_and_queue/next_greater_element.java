package Questions.Stack_and_queue;
import java.util.*;

public class next_greater_element {
    
    // Every element will do 3 thing -,a,+ (pop all the number in stack who are smaller than him , print/store ans , and push itself in stack)
    // vo push isliye krta h because current element usse phle valle numbers k liye potential ans bn skta h 
    
    public static int[] next_grater(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        int[] ans=new int[n];
        stack.push(arr[n-1]);
        arr[n-1]=-1;

        for(int i=n-2;i>=0;i--){
            // Step 1 :- pop 
            while(stack.size() >0 && arr[i]>=stack.peek()){
                stack.pop();
            }

            //Step2 ans 
            if(stack.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
                
            }

            //Step3 push itself
            stack.push(arr[i]);
        }
        return(ans);


    }
}
