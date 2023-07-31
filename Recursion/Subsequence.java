package Recursion;

//All possible combinations 
import java.util.*;
public class Subsequence {
    
    public static String[] ssequence(String str){
        if(str.length()==0){
            String[] arr={""};
            return(arr);
        }

        String[] ans=ssequence(str.substring(1));
        String[] arr=new String[2*ans.length];
        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }

        for(int i=0;i<ans.length;i++){
            arr[ans.length+1]=str.charAt(0)+ans[i];
        }
        
        return arr;

    }


    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> nums){

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        int index=0;
        solve(nums,output,index,ans);
        return ans;
    }

    public void solve(ArrayList<Integer> nums, ArrayList<Integer> output,int index,ArrayList<ArrayList<Integer>> ans){
        if(index>=nums.size()){
            ans.add(output);
            return;
        }

        //exclude

        solve(nums,output,index+1,ans);

        //include
        int ele=nums.get(index);
        output.add(ele);
        solve(nums, output, index+1, ans);

    }
}
