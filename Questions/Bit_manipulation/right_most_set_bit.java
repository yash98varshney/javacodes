package Questions.Bit_manipulation;

public class right_most_set_bit {
    
    public static void main(String[] args){
        int n=72;
        int setbitmask=( n & -n);
        System.out.println(Integer.toBinaryString(setbitmask));
    }
}

//https://www.youtube.com/watch?v=XcSr6TIMl7w&list=PL-Jc9J83PIiFJRioti3ZV7QabwoJK6eKe&index=2

/*
process :- 
take 2's complent of n than (&) it with n this will give you ans.

*/
