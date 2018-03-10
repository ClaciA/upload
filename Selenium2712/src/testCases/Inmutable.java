package testCases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Inmutable {
public static void main(String[] args) {
	String str="abc";
	str.replaceAll("a", "d");
	System.out.println(str);
	LocalDate now= LocalDate.parse("2018-02-11",DateTimeFormatter.ISO_LOCAL_DATE);
	
	
}
}
