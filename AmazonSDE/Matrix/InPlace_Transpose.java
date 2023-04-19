package AmazonSDE.Matrix;

// inplace transpose of n X n matrix
public class InPlace_Transpose {
    
    public static int[][] transpose(int[][] arr){
        int n=arr[0].length;
        int i=0;
        int j=0;
        while(i<n){
            while(j<n){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                j++;
            }
            i++;
            j=i;

        }
        return arr;

    }

    public static void main(String[] args){
        
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=transpose(arr);
        int n=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
