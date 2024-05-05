package Recursion;

import java.util.ArrayList;

public class Permutation_of_String {
    
    public static void main(String[] args){
        // ArrayList<String> ans=storeSubsets("abc", 0, "");
        // System.out.println(ans);
        int[] arr={1,2,3};
        ArrayList<ArrayList<Integer>> iterativeans=iterative(arr);
        char[] ch={'a','b','c'};
        permutation(ch,0);
    }

    //print subset of the String 
    private static void printSubset(String str,int i,String ans){
        if(i>=str.length()){
            System.out.println(ans);
            return;
        }
        
        //include
        char current=str.charAt(i);
        //ans=ans+current;
        printSubset(str, i+1, ans+current);
        //ans=ans.substring(0,ans.length()-1);

        //exclude
        printSubset(str, i+1, ans);
    }

    private static ArrayList<String> storeSubsets(String str,int i,String ans){
        if(i>=str.length()){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(ans);
            return arr;
        }


        ArrayList<String> left=storeSubsets(str, i+1, ans+str.charAt(i));
        ArrayList<String> right=storeSubsets(str, i+1, ans);
        left.addAll(right);
        return left;
    }

    private static ArrayList<ArrayList<Integer>> iterative(int[] arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(Integer num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    private static void permutation(char[] arr,int index){
        if(index>=arr.length){
            String s=new String(arr);
            System.out.println(s);
            return;
        }

        for(int i=index;i<arr.length;i++){
            char temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            permutation(arr, index+1);
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
}
