package Binarysearch;

public class book_allocation_problem {
    
    // n:-  number of books/length of array
    // m:- number of students
    
    private static boolean isPossible(int[] arr,int n,int m,int mid){
        int pagesum=0;
        int studentCount=1;

        for(int i=0;i<n;i++){
            if(pagesum+arr[i]<=mid){
                pagesum+=arr[i];
            }
            else{
                studentCount++;
                if(studentCount > m || arr[i]>mid ){
                    return false;
                }
                pagesum=arr[i];
            }
        }
        return true;

    }


    public static int allocation(int[] arr,int n,int m){
        int s=0;
        int sum=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int e=sum;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(isPossible(arr, n, m, mid)){
                ans=mid;
                e=mid-1;  
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
}

//https://www.youtube.com/watch?v=YTTdLgyqOLY&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=19

/* Exact same problem is painters problem must do 
Main catch for these problem is 
return the area of the minimum time to get this job done of painting
 find out the minimal value of the maximum amount of time 
 You have to allocate the book to 'm' students such that the maximum number of pages are assigned the student is minimum ... 
 

 These type of statements are hint for these questions
 

*/
