package AmazonSDE.Sorting;

import java.util.*;

public class K_closest_point {
    

    public static int[][] closest(int[][] arr,int k){
        int n=arr.length;
        int[][] ans=new int[k][2];
        int[] dis=new int[n];

        for(int i=0;i<n;i++){
            int x2=arr[i][0];
            int y2=arr[i][1];

            int distance=(x2*x2)+(y2*y2);

            dis[i]=distance;

        }

        for(Integer x:dis){
            System.out.println(x);
        }

        Arrays.sort(dis);

        int maxDis=dis[k-1];

        for(int i=0;i<k;i++){
            int x2=arr[i][0];
            int y2=arr[i][1];
            int distance=(x2*x2)+(y2*y2); 

            if(distance<=maxDis){
                ans[i]=arr[i];
            }
        }

        return ans;
    }


    public static void main(String[] args){
        //[[3, 3], [5, -1], [-2, 4]]
        int[][] arr={{1,3},{-1,3},{5,8}};
        int k=2;
        int[][] ans=closest(arr, k);

        for(int i=0;i<k;i++){
            System.out.print(ans[i][0]+" ");
            System.out.print(ans[i][1]);
            System.out.println();
        }
    }
}
