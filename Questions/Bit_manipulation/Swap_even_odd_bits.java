package Questions.Bit_manipulation;

public class Swap_even_odd_bits {

    public static int swap(int n){
        int odd_mask=0x55555555;
        int even_mask=0xAAAAAAAA;

        int odd_bits=(n&odd_mask);
        int even_bits=(n&even_mask);
        odd_bits <<= 1;
        even_bits >>=1;
        int ans=odd_bits | even_bits ;
        return(ans);
    }

    public static void main(String[] args){
        int n=23;
        int ans=swap(n);
        System.out.println(ans);
    }
}

//https://www.youtube.com/watch?v=GbH8PcqKosk

/*
1. we and all the odd bits of N with the mask 10101010... this will give us only even bit 
2. than we and all the even bit of n with 01010101... this will give all the odd bits 
3. left shift the odd bits recieved so that they go to even places 
4. right shift even bits so that they will comes to odd places 
5. finally or the both ;eft and right shift bits.


*/