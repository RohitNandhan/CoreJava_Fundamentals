package IOReadWrite;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ScanFile {
	    public static void main(String[] args) {
	        String input = "  122 a22 23434 ASNNS12,";
	     	     
	        // Use regular expression to split and keep only numeric parts
//	        String[] parts = input.split("[\\s]\\S+");
//	        System.out.println(parts);
	        // \\D matches non-digit characters
//	        
//	        for (String part : parts) {
//	            if (!part.isEmpty()) {
//	              // int number = Integer.parseInt(part);
//	                System.out.println("Extracted number: " + part);
//	            }
	        
	        Pattern pattern = Pattern.compile("\\d{5}+");
            Matcher matcher = pattern.matcher(input);
            matcher.find();
           String res= matcher.group();
            System.out.println(res);
            
	        }
	    
	

}
