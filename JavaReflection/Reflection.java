import java.lang.reflect.Field;

public class Reflection {
    
    public static void main(String[] args){
        String c="foo";
        Reflection ref=new Reflection();
        Class s=ref.getClass();
        // s=Reflection.class.getSuperclass();
        // String ans=(s.toString().equals("class Reflection")) ?  "True":"False";
        // System.out.println(s.getDeclaredField("str"));


        boolean b;
        Class bol=boolean.class;
        System.out.println(bol);

        try{
            s=Class.forName("ReflectionTest");
//https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html
//https://docs.oracle.com/javase/tutorial/reflect/member/fieldModifiers.html
            //getDeclaredFields
            System.out.println(s.getDeclaredField("str"));

            //getDeclaredFields
            Field[] arr=s.getDeclaredFields();
            for(Field x:arr){
                System.out.println(x.toString());
            }
        }
        catch(Exception e){
            
        }

        // Reflection rt=new Reflection();
        // Class rtClass=Class.forName("Reflection");
        // rtClass.getMethod("testMethod",null);
        
    }

    public void testMethod(){
        System.out.println("Hello");
    }
}
