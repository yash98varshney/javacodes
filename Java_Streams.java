import java.util.*;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java_Streams {
    
    public static void main(String[] args){
        List<String> str=Arrays.asList("Hello","hi","","holla");
        List<String> ans=str.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(ans);

        //Intermediate function use 

        //Map

        List<Integer> l1=Arrays.asList(5,7,8,4,4,4,25,25);
        List<Integer> a=l1.stream().map(y -> y*y).distinct().collect(Collectors.toList());
        System.out.println(a);

        // filter

        student s1=new student("Ram",5,2);
        student s2=new student("Shyam",3,2);
        student s3=new student("Mohan",2,2);
        List<student> arrange=new ArrayList<>();
        arrange.add(s1);
        arrange.add(s2);
        arrange.add(s3);

        //long fq=arrange.stream().map(l ->l.name).filter(q -> q.startsWith("R")).collect(Collectors.counting());
        List<String> fq=arrange.stream().map(l ->l.name).filter(q -> q.startsWith("R")).collect(Collectors.toList());
        System.out.println(fq);

        //Sorted

        List<Integer> sort=arrange.stream().map(q -> q.rollnumber).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sort);
    }
}

class student{

    public String name;
    public int rollnumber;
    public int grade;

    public student(String name,int rollnumber,int grade){
        this.name=name;
        this.rollnumber=rollnumber;
        this.grade=grade;
    }
}
