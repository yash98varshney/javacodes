package Questions.two_pointer;

public class Median_of_2_sorted_array {
   
    public static float median(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;

        int total=m+n;

        int med=total/2;
        int[] ans=find(arr1, arr2);
        if(total%2==0){
            float ret=((float)ans[med]+(float)ans[med-1])/2;
            return (ret);
        }
        else{
            return (ans[med+1]);
        }


    }

    public static int[] find(int[] arr1,int[] arr2){

        int n=arr1.length;
        int m=arr2.length;
        int p1=0;
        int p2=0;
        int[] ans=new int[n+m];
        int count=0;

        while(p1<n && p2<m){

            if(arr1[p1]>arr2[p2]){
                ans[count]=arr2[p2];
                count++;
                p2++;
            }
            else if(arr1[p1]<arr2[p2]){
                ans[count]=arr1[p1];
                count++;
                p1++;
            }
            else{
                ans[count]=arr1[p1];
                count++;
                p1++;
            }
        }

        while(p1<n){
            ans[count]=arr1[p1];
            count++;
            p1++;
        }

        while(p2<m){
            ans[count]=arr2[p2];
            count++;
            p2++;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr1={10,20,30,40,50};
        int[] arr2={5,15,25,35 };

        float a=median(arr1, arr2);
        System.out.println(a);
    }
}
