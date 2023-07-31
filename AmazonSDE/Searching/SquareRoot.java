package AmazonSDE.Searching;

import java.util.Scanner;

public class SquareRoot {
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int l=0;
        int r=num;

        int mid =l+(r-l)/2;
        int ans=0;
        while(l<=r){
            if(mid*mid==num){
                ans=mid;
                break;
            }
            else if(mid*mid<num){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            mid =l+(r-l)/2;
        }
        System.out.println(ans);

        s.close();
    }
}
