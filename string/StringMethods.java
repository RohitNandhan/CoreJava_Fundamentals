package string;

import java.util.Arrays;

class StringMethods {
	 
	 String str;
	 String[] arrString;
	 
	 public StringMethods() {
		// TODO Auto-generated constructor stub
		 
		 str="Hello World";
		 String str1="  org   ";
		 String str2=new String();
		 //checks if the litral present and return boolean
		 System.out.println("Contains "+str.contains("hello"));
		 // returns length of the string 
		 System.out.println("Length "+str.length());
		 //checks if the string is empty
		 System.out.println("is Empty "+str1.isEmpty());
		 //checks if the string contains only spaces
		 System.out.println("is Blank "+str1.isBlank());
		 //converts to Uppercase
		 System.out.println("Uppercase "+str.toUpperCase());
		 //converts to Lowercase
		 System.out.println("Lowercase "+str.toLowerCase());
		 //start letter of string
		 System.out.println("Starting with "+str.startsWith("h"));
		 //end letter of string
		 System.out.println("Ending with "+str.endsWith("d"));
		 //replace a letter or sequence of letter
		 System.out.println("Replace "+str.replace("world","god"));
		 //removes the leading and trailing spaces from the string and allocates new object
		 System.out.println("Trimming "+str1.trim());
		//removes the leading and trailing spaces from the string
		 System.out.println("Strip "+str1.strip());
		//substring 
		 System.out.println("Substring "+str.substring(6));
		// to array of bytes
		 System.out.println("Array of Bytes " +Arrays.toString(str.getBytes()));
		 // to array of char
		 System.out.println("Array of Bytes " +Arrays.toString(str.toCharArray()));
		 //char at index
		 System.out.println("char at index "+str.charAt(0));
		 //Split the string into array
		 System.out.println("Spliting "+Arrays.toString(str.split(" ")));
		 
	 }
	
	 
	 

	
		
	
	
}

 