package Stack;

public class Stackuse {
    public static void main(String[] args) throws StackFullException{
        StackusingArraylist stack=new StackusingArraylist();
        for(int i=0;i<6;i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            try{
                System.out.println(stack.pop());
            }catch(StackEmptyException e){
                //Never reach here 
            } 
        }
    }
    
}
