package AmazonSDE.Searching;

public class Missing_number_in_array {
    
    public static void main(String[] args){
        int N=10;
        int xor1=0;
        int xor2=0;
        int A[] = {1,2,3,4,5,6,8,9,10};
        for(int i=1;i<=N;i++){
            xor1=xor1^i;
        }
        

        for(int i=0;i<N-1;i++){
            xor2=xor2^A[i];
        }
        

        System.out.println(xor1^xor2);
    }
}
