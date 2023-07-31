package OOPS.Interface_practice;

public class store {
    
    Member m[]=new Member[100];
    int count=0;

    void registration(Member mem){
        m[count]=mem;
        count++;
    }

    void inviteSale(){
        for(int i=0;i<count;i++){
            m[i].callback();
        }
    }

    
}
