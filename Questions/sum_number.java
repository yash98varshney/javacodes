package Questions;
import java.util.*;
public class sum_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int num=Integer.parseInt(s);
        int sum=0;
        while(num>0 || sum>9){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
            if(num==0 && sum>9){
                num=sum;
                sum=0;
            }
        }
        System.out.println(sum);
        sc.close();
    }    
}



