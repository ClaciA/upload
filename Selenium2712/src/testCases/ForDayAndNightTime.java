package testCases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class ForDayAndNightTime {
public static void main(String[] args) {
	LocalDate now= LocalDate.now();
	LocalDateTime ldt= LocalDateTime.now();
DateTimeFormatter standardFormat= DateTimeFormatter.ISO_LOCAL_DATE;
DateTimeFormatter f1=DateTimeFormatter.ISO_DATE;
DateTimeFormatter f2=DateTimeFormatter.ISO_ORDINAL_DATE;
DateTimeFormatter f3=DateTimeFormatter.ISO_DATE_TIME;
DateTimeFormatter f4=DateTimeFormatter.ISO_WEEK_DATE;
System.out.println(standardFormat.format(now));
System.out.println(f1.format(now));

System.out.println(f2.format(ldt));
System.out.println(f3.format(now));
 
//LocalDate Bday= LocalDate.of(1985,Month.JANUARY , 27);
DateTimeFormatter Bday= DateTimeFormatter.ofPattern("yyyy_dd");
System.out.println(Bday.format(now));


}
}
