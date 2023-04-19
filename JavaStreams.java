import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class JavaStreams {

    public static void main(String[] args){
        Stud s1=new Stud("hari",2,3.6,"male",Arrays.asList("swinmmng","bascketball","volleyball"),20);
        Stud s2=new Stud("Ram",3,3.8,"male",Arrays.asList("swinmmng","gymnastics","volleyball"),60);
        Stud s3=new Stud("Lax",4,4.0,"male",Arrays.asList("swinmmng","soccer","volleyball"),80);
        Stud s4=new Stud("Mohan",3,3.9,"male",Arrays.asList("swinmmng","cricket","soccer"),90);

        List<Stud> studentlist=new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s4);


        //Student name and there activities in a map
        Map<String,List<String>> map=studentlist.stream().collect(Collectors.toMap(Stud::getName,Stud::getActivities));
        System.out.println(map);

        //Students gradelevel grater than 3 and CGPA >=3.9
        Map<String,List<String>> map2=studentlist.stream()
                                                    .filter((x)-> x.getGradelevel()>=3)
                                                    .filter((student) -> student.getGpa()>=3.9)
                                                    .collect(Collectors.toMap(Stud::getName,Stud::getActivities));


        //Get list of names of Student use of MAP method converting one type to another 
        List<String> ans=studentlist.stream()
                                .map((student) -> student.getName())
                                .map(String::toUpperCase)    
                                .collect(Collectors.toList());
        

        //List of all the activities (disitinct)
        List<String> arr=studentlist.stream()
                                    .map(Stud::getActivities)
                                    .flatMap(List::stream)
                                    .distinct()
                                    .collect(Collectors.toList());
        
        


        //Sort using comparator in reverse order 
        studentlist.stream().sorted(Comparator.comparing(Stud::getName).reversed()).collect(Collectors.toList());


        //Want multiplicaton of these numbers
        List<Integer> integer=Arrays.asList(1,3,4,7);
        /*
         * 1
         * 3
         * 4
         * 7
         * 
         * a=1(default value/Identity),b=1(from Stream) => multiplication is performed and ans is returned and stored in 'a'
         * a=1(from previous multi) , b=3 (from stream) 
         * a=3(from previous multi) ,b=4 (from stream)
         * a=12(from previous multi) , b=7(from stream)
         */
        int multipliedoperation=integer.stream().reduce(1, (a,b) -> a*b );
        System.out.println(multipliedoperation);

        //want GPA of highest student using only reduce method 
        //Way1 

        Optional<Stud> optn1=studentlist.stream().reduce((student1,student2) -> {
            if(student1.getGpa()>student2.getGpa()){
                return student1;
            }
            else{
                return student2;
            }
        });

        //Way2
        Optional<Stud> optn2=studentlist.stream().reduce((st1,st2) -> (st1.getGpa()>st2.getGpa()) ? st1 :st2);
        if(optn1.isPresent()){
            System.out.println(optn1.get());
        }

        if(optn2.isPresent()){
            System.out.println(optn2.get());
        }



        //sum of all the notebooks using map filter reduce
        Optional<Integer> an=studentlist.stream()
                                    .map(Stud::getNotebooks)
                                    //.reduce(0, (a,b) -> a+b); // will return int as ans
                                    .reduce(Integer::sum); //this will give optional as output 
        System.out.println(an.get());


        //Generate map of people living in same city
        List<Employee> empList=new ArrayList<>();
        Employee e1=new Employee("Ram", 10, "Delhi");
        Employee e2=new Employee("Mohan", 20, "Hyd");
        Employee e3=new Employee("Lax", 3, "Hyd");
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        Map<String,List<Employee>> empMap=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(empMap);

        //Sort Employee on the basis of name
        List<String> empsorted=empList.stream()
                                        .sorted(Comparator.comparing(Employee::getName).reversed() )
                                            .map(Employee::getName)
                                                .collect(Collectors.toList());
        System.out.println(empsorted);


        //Emplyee id > 3 name of those emplyee 
        List<String> idlist=empList.stream().filter(x -> x.getId()>3).map(Employee :: getName).collect(Collectors.toList());
        System.out.println(idlist);


        //we have to found the count of elements having length greater than 3 
        List<String> listst=Arrays.asList("java","happy","sad","love","rom");

        long countele=listst.stream().filter(x -> x.length() >3).count();
        System.out.println(countele);


        //Find count of vouwels in string given

        String str="Helo Hello";
        long vowcount=str.chars().filter(x -> {
            return (x=='a' || x=='e' || x=='i' || x=='o' || x=='u' );
        }).count();

        System.out.println(vowcount);


        String[] lar={"java","Hibernate","springboot","microservices"};
        String largestString=Arrays.stream(lar).reduce((x,y) -> x.length()>y.length() ? x:y).get();
        System.out.println(largestString);

        // List of numbers find the number of times those integer are repeating 
        List<Integer> num=Arrays.asList(5,4,6,7,4,5,6,7,4,4,6);
        Map<Integer,Long> countMap=num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMap);


        //From the given employee list concat the names of all the empl/stud
        //1st method
        String concat1=empList.stream().map(Employee::getName).collect(Collectors.joining());

        //second overridden method
        String concat2=empList.stream().map(Employee::getName).collect(Collectors.joining("-"));

        System.out.println(concat2);


        //using minBy() and maxBy() collectors

        Optional<Stud> minBystud=studentlist.stream().collect(Collectors.minBy(Comparator.comparing(Stud::getGpa)));
        System.out.println(minBystud.get());

        // Same for MAXBY
        

        //Get nth smallest / greatest number get(n-1) n the nth number like 3rd largest

        int threelar=num.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(2-1);
        System.out.println(threelar);

    }
}


class Stud{
    String name;
    int gradelevel;
    double gpa;
    String gendre;
    List<String> activities;
    int notebooks;

    public int getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(int notebooks) {
        this.notebooks = notebooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradelevel() {
        return gradelevel;
    }

    public void setGradelevel(int gradelevel) {
        this.gradelevel = gradelevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    Stud(String name,int gradelevel,double gpa,String gendre,List<String> activities,int notebooks){
        this.name=name;
        this.gradelevel=gradelevel;
        this.gpa=gpa;
        this.gendre=gendre;
        this.activities=activities;
        this.notebooks=notebooks;
    }

    @Override
    public String toString(){
        return (this.name);
    }

    

}

class Employee{
    String name;
    int id;
    String city;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee(String name, int id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }

}
