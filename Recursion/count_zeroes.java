package Recursion;
//number of zeroes in array;

public class count_zeroes {
    public static int count(int[] arr,int i){
        if(i==arr.length){
            return(0);
        }

        int ans=count(arr,i+1);
        if(arr[i]==0){
            return(ans+1);
            
        }
        return(ans);
    } 

    public static void main(String[] args){
        int[] arr={1,1,2,1,4};
        int co=count(arr,0);;
        System.out.println(co);
    }
}
