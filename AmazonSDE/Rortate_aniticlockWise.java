package AmazonSDE;

public class Rortate_aniticlockWise {
    public static void main(String[] args){

        int[] arr={1,2,3,4,5};
        int d=2;
        int n=5;
        d=d%n;
        int i=0;
        int j=d-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
        i=d;
        j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        
        i=0;
        j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
