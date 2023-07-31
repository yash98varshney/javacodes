package Binarysearch;

public class element_in_rotated_sored_array {
    
    public static int binarysearch(int[] arr,int start,int end,int n,int k){
        int s=start;
        int e=end;
        int mid=s+(e-s)/2;

        while(s<e){
            if(arr[mid]==k){
                return(mid);
            }
            if(arr[mid]>k){
                e=mid-1;
            }
            if(arr[mid]<k){
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return(-1);
    }

    public static int pivot(int[] arr,int n){
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;

        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return(s);
    }
    
    public static void main(String[] args){
        int[] arr={7,8,9,1,2,3,4};
        int piv=pivot(arr, 7);
        int k=4;
        int ans=Integer.MIN_VALUE;
        int n=arr.length;
        if(k>=arr[0] && k<=arr[piv-1]){
            ans=binarysearch(arr,0,piv, n, k);
        }
        else{
            ans=binarysearch(arr,piv,n, n, k);
        }
        System.out.println(ans);

    }
}


/*

Collections.sort(list, new Comparator<Employee>() {
    @Override
    public int compare(Employee x, Employee y) {
        return e1.getName().compareToIgnoreCase( e2.getName() );

                
    }
});

*/
