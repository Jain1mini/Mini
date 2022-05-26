import java.io.*;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;



public class DateDemo16 {

	public static void main(String[] args) {
		
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(zdt);
		MonthDay md = MonthDay.now();
		
		
		Period p = Period.of(2,2,10);
		
		
		
		System.out.println(p.addTo(LocalDate.now()));

	}

}


