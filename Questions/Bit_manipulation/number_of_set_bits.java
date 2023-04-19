package Questions.Bit_manipulation;

public class number_of_set_bits {
    //Kernighans Algorithm 
    public static void main(String[] args){
        int n=3;
        int count=0;
        while(n!=0){
            int right_most_set_bit_mask=(n & -n);
            System.out.println(right_most_set_bit_mask);
            n=n-right_most_set_bit_mask;
            System.out.println(n);  
            System.out.println("-------");
            count++;
        }
        System.out.println(count);
    }
}

/*
In case of brute force:-

int count=0;
while(n>0){
    count=count+(n&1);
    n=n>>1;
}
System.out.println(count);

*/