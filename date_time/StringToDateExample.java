package date_time;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class StringToDateExample {
	    public static void main(String[] args) {
	        String dateStr = "2023-11-09";
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	        
	        try {
	            Date date = dateFormat.parse(dateStr);
	            dateFormat.applyPattern("yyyy-MM-dd");
	            String newdate=dateFormat.format(date);
	            System.out.println(newdate);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    

	        
//	                      Date date = Date.parse(dateStr);
//	            // Specify the desired date format
//	            String DATE_FORMAT = "yyyy-MM-dd";
//	            // Create object of SimpleDateFormat and pass the desired date format.
//	            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
//	            /*
//	             * Use format method of SimpleDateFormat class to format the date.
//	             */
//	            System.out.println("Today is " + sdf.format(date));
//	        
	        }
	    
}
