package AmazonSDE.Sorting;


import java.util.Arrays;

public class Find_Triplet_with_0_sum {
    
    public static boolean triplet(int[] arr,int n){
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            int s=i+1;
            int e=n-1;

            while(s<e){
                if(arr[s]+arr[e]+arr[i]==0){
                    return true;
                }
                else if(arr[s]+arr[e]+arr[i]>0){
                    e--;
                }
                else{
                    s++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println(triplet(arr, 3));
    }
}
