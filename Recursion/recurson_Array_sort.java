package Recursion;

public class recurson_Array_sort {
    public static boolean checksort(int[] arr){
        int[] small=new int[arr.length -1]; 
        if(arr.length==0 || arr.length==1){
            return(true);
        }
        for(int i=1;i<arr.length;i++){
            small[i-1]=arr[i];
        }
        boolean ans=checksort(small);
        if(!ans){
            return(false);
        }
        if(arr[0]<arr[1]){
            return(true);
        }
        else{
            return(false);
        }


    }

//approach 2 

    public static boolean Array_sort(int[] arr,int i){
        if(i==arr.length-1 || arr.length==0){
            return(true);
        }
        boolean ans=Array_sort(arr, i+1);
        if(!ans){
            return(false);
        }
        if(arr[i]<arr[i+1]){
            return(true);
        }
        else{
            return(false);
        }
    }

    public static void main(String[] args){
        int[] arr={2,1};
        boolean ans=Array_sort(arr,0);
        System.out.println(ans);
    }
}
