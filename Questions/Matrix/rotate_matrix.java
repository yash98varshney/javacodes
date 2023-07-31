package Questions.Matrix;

//rotate matrix by 90 degree 

// 1st method:- 
// take transpose of the matrix and than reverse each row 

//2nd method :- 
// use 4 pointers 


public class rotate_matrix {
    public static void main(String[] args){
        int count=0;
        for(int i=0;i<5;i++){
            count+=1;
            if(i==2){

                continue;
            }
            System.out.println(i);//0 1 2 3
            System.out.println(count);//1 2 3 4
            System.out.println("-------------------------");
        }
    }
}
