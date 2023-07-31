//Joda Time API / LocalDate Time API

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date_and_Time {
    
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        LocalDate dt=LocalDate.parse("2020-03-01");
        System.out.println(dt);
        System.out.println(d);

        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime of=OffsetDateTime.now();

        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String s="Hello abcd efgd ghbjfipo ";
        
        System.out.println(s.endsWith("ghbjfipo"));

        
    }

}
