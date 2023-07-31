package AmazonSDE.Sorting;

public class Merge_sort {
    
    public static void mergersort(int[] arr,int s,int e){
        
        //If Single element remains means it's sorted 

        if(s>=e){
            return;
        }
        int mid=(s+e)/2;

        mergersort(arr, s, mid);
        mergersort(arr, mid+1, e);
        merge(arr,s,e);
    }

    public static void merge(int[] arr,int s,int e){
        int size=e-s+1;
        int mid=(s+e)/2;
        int[] temp=new int[size];
        int i=s;
        int j=mid+1;
        int count=0;

        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[count]=arr[i];
                i++;
                count++;
            }
            else if(arr[i]==arr[j]){
                temp[count]=arr[i];
                i++;
                j++;
                count++;
            }
            else{
                temp[count]=arr[j];
                j++;
                count++;
            }
        }

        while(i<=mid){
            temp[count]=arr[i];
            i++;
            count++;
        }

        while(j<=e){
            temp[count]=arr[j];
            j++;
            count++;
        }
        int m=0;

        for(int l=s;l<e;l++){
            arr[l]=temp[m];
            m++;
        }

    }
}
