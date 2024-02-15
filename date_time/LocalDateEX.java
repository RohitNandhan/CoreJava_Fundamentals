package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LocalDateEX implements Comparator<T> {
	
	    public static void main(String[] args)  {
	        // Creating a LocalDate object
	        LocalDate currentDate = LocalDate.now();
	        System.out.println("Current Date: " + currentDate);
	        
	        // Parsing a date string to LocalDate
	        String dateString = "2023-12-30";
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
	        System.out.println("Parsed Date: " + parsedDate);
	        
	        String userDate = "2100-01-01";

	        LocalDate userInputDate = LocalDate.parse(userDate);
	        // Formatting a LocalDate
	        LocalDate someDate = LocalDate.of(2023, 8, 19);
	        String formattedDate = someDate.format(formatter);
	        System.out.println("Formatted Date: " + formattedDate +" "+userInputDate);
	    }
	    	List data=new ArrayList<>();
	    	
	    //data.forEach(number -> System.out.println(number));
		@Override
		public int compare(T o1, T o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	





