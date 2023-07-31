package Questions.Bit_manipulation;

public class on_off_toggle_check_bits {
    
    public static void main(String[] args){
        int n=21;
        
        int i=0;
        int j=0;
        int k=0;
        int l=0;
// Mask to check any bit on i,j,k,l represent the bit number;
        int onmask=(1<<i);
        int offmask=~(1<<j);
        int toggle_mask=(1<< k);
        int checkmask=(1<< l );

        System.out.println(n| onmask); // check for particular on bit;
        System.out.println(n & offmask);
        System.out.println(n ^ toggle_mask);
        System.out.println((n & checkmask)==0 ? false : true  ); //check if particular bit is 0 or not if whole output becomes 0 than bit is zero otherwise 1
    }

}
