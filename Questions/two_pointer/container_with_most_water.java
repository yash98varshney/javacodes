package Questions.two_pointer;
//import java.util.*;
public class container_with_most_water {
    //brute force approach 

    public static int maxArea(int[] arr){
        int n=arr.length;
        int maxarea=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int min_height=Math.min(arr[i],arr[j]);
                int distance=j-i;

                int area=distance*min_height;

                maxarea=Math.max(maxarea,area);
            }
        }
        return(maxarea);
    }


    // O(n) approach --

    public static int maxArea2(int[] arr){
        int n=arr.length;
        int maxarea=0;

        int i=0;
        int j=n-1;

        while(i<j){
            int LH=arr[i];
            int RH=arr[j];
            int min_height=Math.min(LH,RH);

            int distance=j-i;
            
            int area=min_height*distance;
            maxarea=Math.max(maxarea,area);
            if(LH<RH){
                i++;
            }
            else{
                j--;
            }
        }
        return(maxarea);
    }
}


//  https://www.youtube.com/watch?v=ZHQg07n_tbg