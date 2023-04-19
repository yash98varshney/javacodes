package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combination_if_phone_number_leetcode {
    
    public static List<String> letterCombination(String nums){
        
        List<String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();

        String[] Mapper=new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        solve(nums,output,Mapper,ans,index);
        return ans;

    }

    public static void solve(String nums,StringBuilder output,String[] Mapper,List<String> ans,int index){
        if(index >= nums.length()){
            ans.add(output.toString());
            return ;
        }

        int number=nums.charAt(index)-'0';
        String map=Mapper[number];

        for(int i=0;i<map.length();i++){
            output.append(map.charAt(i));
            solve(nums, output, Mapper, ans, index+1);
            // Backtrack  so that last element is removed and we are back to original state 
            output.deleteCharAt(output.length()-1);
        }

    }

    public static void main(String[] args){
        List<String> ans=letterCombination("23");
        for(String x: ans){
            System.out.println(x);
        }
    }


}
