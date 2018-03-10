package testCases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalD {
	public static void main(String[] args) {
		
		LocalDate someBirthday= LocalDate.of(1996, 01, 27);
		LocalDate otherDate= LocalDate.of(1996, Month.JANUARY, 27);
		System.out.println(someBirthday);
		System.out.println(otherDate);
		LocalTime end3=LocalTime.of(17,23 );
		LocalDateTime rigthNow=LocalDateTime.of(2018, Month.FEBRUARY,10,12,13);
		
		LocalDateTime rigthNow2=LocalDateTime.of(someBirthday,end3 );
		LocalDateTime twoYearsLater= rigthNow.plusYears(2);
		LocalDateTime threeweeksLater= rigthNow.minusDays(3);
		System.out.println(threeweeksLater);
		LocalDate today=LocalDate.of(2018,Month.FEBRUARY,11);
	Period p1= Period.ofDays(65);
	System.out.println(today.plus(p1));
		LocalDate today1= LocalDate.of(2018,Month.FEBRUARY,11);
		DateTimeFormatter isoLocalDate= DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(isoLocalDate.format(today1));
	}

}
