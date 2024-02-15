package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeCRUD {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//current date
		LocalDate currentDate =LocalDate.now();
		//current time
		LocalTime currentTime=LocalTime.now();
		//current date and time 
		LocalDateTime currentDateTime=LocalDateTime.now();
		
		//parsing Date and Time Strings
		String dateString="2023-07-31";
		LocalDate date=LocalDate.parse(dateString);
		
		String timeString="14:30";
		LocalTime time=LocalTime.parse(timeString);
		
		//Formatting Date and Time
		LocalDateTime dateTime =LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime=dateTime.format(formatter);
		System.out.println(dateTime);
		System.out.println(formattedDateTime);
		
		LocalDate date1=LocalDate.of(2023, 7, 31);
		LocalDate date2=LocalDate.now();
		
		Duration dur=Duration.between(date1.atStartOfDay(), date2.atStartOfDay());
		System.out.println(dur);
		long daysBetween=dur.toDays();
		System.out.println(daysBetween);
		
		

	}
	
	

}
