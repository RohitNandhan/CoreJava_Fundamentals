package date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//
//public class TimeConversion {
//
//	public static void main(String[] args) {
//		String time="03:30 PM";
//	DateTimeFormatter timeFormat12=DateTimeFormatter.ofPattern("hh:mm a");
//	LocalTime time12Hours=LocalTime.parse(time,timeFormat12);
//	DateTimeFormatter timeFormat24=DateTimeFormatter.ofPattern("HH:mm:ss");
//	
//	String time24H=time12Hours.format(timeFormat24);
//	System.out.println(time24H);
//	
//	}
//}
public class TimeConversion {
public static void main(String[] args) {
    // Input time in 12-hour format (with AM/PM indicator)
    String time12Hour = "03:30 PM"; // Replace this with your desired time

    // Define the format for 12-hour time
    DateTimeFormatter formatter12Hour = DateTimeFormatter.ofPattern("hh:mm a");

    // Parse the input time string into a LocalTime object
    LocalTime localTime12Hour = LocalTime.parse(time12Hour, formatter12Hour);

    // Define the format for 24-hour time
    DateTimeFormatter formatter24Hour = DateTimeFormatter.ofPattern("HH:mm");

    // Format the LocalTime object to get the time in 24-hour format
    String time24Hour = localTime12Hour.format(formatter24Hour);

    System.out.println("Time in 24-hour format: " + time24Hour);
}
}