package Sorting;

public class SelectionSort {

    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mini=arr[i];
            int min_index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<mini){
                    mini=arr[j];
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }
        return(arr);

    }

    public static void main(String[] args){
        int[] arr={3,5,1,0,9,6,9};
        int[] ans=sort(arr);
        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
    
}
