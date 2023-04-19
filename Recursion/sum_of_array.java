package Recursion;

public class sum_of_array {

    public static void print(int[] arr,int i){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.println("value of i= "+i);
    }

    public static int sumarr(int[] arr){

        //base case 
        if(arr.length==0){
            return(0);
        }
        if(arr.length==1){
            return(arr[0]);
        }
        
        int[] small=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            small[i-1]=arr[i];
        }
        //recursion call
        int ans=sumarr(small);
        
        //calculation and return as small becomes arr when goes up so we take arr[0].
        return(ans+arr[0]);
    }
//approach 2
    public static int sumofarr(int[] arr, int i){
        print(arr,i);
        if(i==arr.length){
            return(0);
        }
        int ans=sumofarr(arr, i+1);
        return(arr[i]+ans);

    }
//approach 3
    public static int Sumarr(int[] arr,int size){
        if(size==0){
            return(0);
        }
        if(size==1){
            return arr[0];
        }
        int ans=Sumarr(arr, size-1);
        return(arr[0]+ans);
    }

    public static void main(String[] args){
        int[] arr={1,2,3};
        int ans=sumofarr(arr,0);
        System.out.println(ans);
    }
}
