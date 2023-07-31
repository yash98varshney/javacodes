package Questions.Matrix;


// if any element of row or column is 0 than convert that whole row and column to 0 without using extra space 


public class Set_Matrix_zeroes {

    public static void set(int[][] arr,int n,int m ){
        boolean isrow=false;
        boolean iscolumn=false;
    // checking for first column is there any 0 originally 
        for(int i=0;i<n;i++){
            if(arr[i][0]==0){
                isrow=true;
            }
        }
    // checking for first row is there any 0 originally 
        for(int j=0;j<m;j++){
            if(arr[0][j]==0){
                iscolumn=true;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    arr[i][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            if(arr[i][0]==0){
                for(int j=0;j<m;j++){
                    arr[i][j]=0;
                }
            }
        }

        for(int j=1;j<m;j++){
            if(arr[0][j]==0){
                for(int i=0;i<n;i++){
                    arr[i][j]=0;
                }
            }
        }

        if(isrow){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }

        if(iscolumn){
            for(int j=0;j<m;j++){
                arr[0][j]=0;
            }
        }



    }
    
}
