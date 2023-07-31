package Recursion;

public class Mergesort {
    private static void merge(int[] arr,int si, int ei){
        int size=ei-si+1;
        int mid=(si+ei)/2;
        int[] out=new int[size];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                out[k]=arr[i];
                i++;
                k++;
            }
            else{
                out[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            out[k]=arr[i];
            k++;
            i++;
        }

        while(j<=ei){
            out[k]=arr[j];
            k++;
            j++;
        }

        int m=0;

        for(int l=si;l<ei;l++){
            arr[l]=out[m];
            m++;
        }

    }



    public static void merge_sort(int[] arr, int si,int ei){
        if(si>=ei){
            return;
        }

        int mid=(si+ei)/2;

        merge_sort(arr, si, mid);
        merge_sort(arr, mid+1, ei);
        merge(arr,si,ei);

    }


    public static void main(String[] args){
        
    }
}
