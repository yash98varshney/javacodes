package Questions;

public class Count_only_repeated {
    
    public static int repeated(int[] arr,int n){

        int s=1;
        int e=n-2;

        int mid=s+(e-s)/2;
        
        while(s<=e){
            int idle=arr[0]+mid;
            if(arr[mid]==arr[mid-1] || arr[mid]==arr[mid+1]){
                return mid;
            }
            else if(idle==arr[mid]){
                s=mid+1;
            }
            else if(idle > arr[mid] || idle <arr[mid]){
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr={2,3,4,5,5};
        int ans=repeated(arr, 5);
        System.out.println(arr[ans]);
    }
}

//Question for reference

//https://www.geeksforgeeks.org/count-of-only-repeated-element-in-a-sorted-array-of-consecutive-elements/

/*
    idle is the number if no repeating element so if any number repeates on left side arr[mid] <idle and if idle == arr[mid] means left m koi repeat ni hua h might be at right
*/