//checking numer in array
package Recursion;

public class checking_num_array {
    public static boolean check(int[] arr,int n){
        if(arr.length==0){

            return(false);
        }
        if(arr.length==1 && arr[0]==n){
            return(true);
        }
        if(arr.length==1 && arr[0]!=n){
            return(false);
        }
        int[] small=new int[arr.length -1];
        for(int j=1;j<arr.length;j++){
            small[j-1]=arr[j];
        }
        boolean ans=check(small,n);
        if(!ans){
            if(arr[0]==n){
                return(true);
            }
            else{
                return(false);
            }
        }
        else{
            return(true);
        }
    }

    public static boolean check2(int[] arr, int n,int i){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==n){
            return true;
        }
        return(check2(arr,n,i+1));
    }
    
    public static void main(String[] args){
        int[] arr={3};
        boolean ans=check(arr,3);
        boolean ans2=check2(arr,3,0);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
