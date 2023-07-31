package String;

public class StringImplementation {

    
    int rollno;  
    String name;  
    String city;  

    public StringImplementation(int rollno,String name,String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }



    //toString() to use this method we have to orverride the existing method 
    @Override
    public String toString(){
        return rollno+" "+name+" "+city;      
    }



    

    public static void main(String[] args){
        String s="Hello"; // using string literal 
        String str=new String("World");  // using new Keyword 

        String newstr = s.concat(str); // concatination of 2 strings as strings are immutable that's why s does not changes. and new object created in the pool.
        Boolean ans1=s.equals(str); // compares exact content of the string .
        Boolean ans2=s.equalsIgnoreCase(str);  //ignore the casing  in the string Eg. Hello is eqaul to HELLO 
        Boolean ans3=s==str; // this will compare the refrence only not exact content of the String .
        int ans4=s.compareTo(str); // this will compare the strings lexographically return 0 if equal retrun +ve value if s>str  return -ve value if str>s

        StringBuilder str1=new StringBuilder("Hello");
        StringBuilder str2=new StringBuilder("  World");
        System.out.println(str1.append(str2));

        //Using .format()
        //Same as python used with format specifier

        String str3=String.format("%s%s",str1,str2);
        System.out.println(str3);

        //Using String.join()

        String s2=String.join("-","a","b");
        System.out.println(s2);

        //Substring 

        String str4="hehheheheheh";
        System.out.println(str4.substring(2,5));

        //String.split()

        String str5="HaHaHahahaHaHa";
        String[] arr=str5.split("Ha");
        System.out.println(arr.length);
        for(String x:arr){
            System.out.println(x);
        }

        //To uppercase and tolowercase

        str=str.toUpperCase();
        str=str.toLowerCase();

        //Startswith  endswith

        System.out.println(str.startsWith("ab"));   // takes only string as arguments

        //value0f()  converts any type into string and takes input as Object only 

        int a=10;
        String s1 =String.valueOf(a);
        System.out.println(s1+10);

        //convert String to integer 

        int ans5=Integer.parseInt(s1);
        System.out.println(ans5);


        // format specifier 

        /*
        %s %S  for string 
        %b %B  for boolean 
        %c %C  for character
        %h %H  for hash code
        %d     decimal
        %o     octal
        %x %X  hexa decimal

        */

        


        System.out.println(newstr);
        System.out.println(str);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        StringImplementation scheck=new StringImplementation(10,"ram","delhi");
        System.out.println(scheck.toString());
    }
}
