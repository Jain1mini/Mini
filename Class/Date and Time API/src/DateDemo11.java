
import java.io.*;

import java.time.*;
import java.util.Date;

public class DateDemo11 {

	public static void main(String[] args) {
		
		//LocalDate d = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		
		LocalDate d = LocalDate.of(2022, Month.MARCH, 10);
		System.out.println(d);

	}

}