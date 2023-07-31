package Recursion;

public class LinearSearch {
    
    public static void print(int[] arr,int i){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.println("value of i= "+i);
    }



    public static boolean Search(int[] arr,int i,int x){
        print(arr,i);
        if(i==arr.length){
            return(false);
        }

        if(arr[i]==x){
            return(true);
        }
        else{
            boolean ans=Search(arr, i+1, x);
            return(ans);
        }

       
    }

    public static void main(String[] args){
        int[] arr={1,2,4,5,3,9};
        boolean ans=Search(arr, 0, 9);
        System.out.println(ans);
    }
}
