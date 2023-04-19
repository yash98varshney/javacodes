package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Question {
    
//Next smaller on right


    class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        //st.push(-1);
        for(int i=0;i<n;i++){
            if( !st.isEmpty() && arr.get(st.peek()) > arr.get(i)  ){
                while(!st.isEmpty() && arr.get(st.peek()) > arr.get(i) ){
                    ans[st.peek()]=arr.get(i);
                    st.pop();
                }
                st.push(i);
            }
            else{
                st.push(i);
            }
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
       ArrayList<Integer> fin=new ArrayList<>();
        for(Integer x: ans){
                fin.add(x);
        }
        return fin;
    }
}
}
