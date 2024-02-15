package PracticePrograms.coreJava.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.w3c.dom.css.Counter;

public class CharaterCount {
//	start
//	get the input string, string lenght < 100
//	if string is empty , print no output, and end
//	convert the capital char in string to small letters
//	check each char with the input string
//	if present add count to the char and print the char count
//	repeat 5 and 6 for all the char in string
//	end

	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		String str=sc.nextLine();
		int len=str.length();
		
		if(str.isEmpty()) {
			System.out.println("The string is empty , no output");
			
		}
		else
		{
			str=str.toLowerCase();
			//getCount_NaiveApproach(str,len);
			//getCount_CounterArray(str, len);
			//getCount_HashMap(str, len);
			getCount_Java8(str, len);
			
		}
	}
	//Using Naive Approach
	static void getCount_NaiveApproach(String str,int len) {
	// TODO Auto-generated method stub
		
		int count[]=new int[256];
		//int len=str.length();
		
		for (int i=0; i<len ; i++) {
			count[str.charAt(i)]++;
		}
			char[] ch=new char[str.length()];
			for (int i=0; i<len ; i++) {
			if(str.charAt(i)==' ')
				continue;
			
			ch[i] = str.charAt(i);
			
			int find=0;
			for(int j=0;j<=i;j++) {
				if (str.charAt(i)==ch[j]) {
					find++;
				}
			}
			if(find ==1) {
			System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  	

			
			}
			
		}
	}
	
	static void getCount_CounterArray(String str1, int len) {
		// TODO Auto-generated method stub
		int counter[]=new int[256];
		String str=removeSpace(str1);
		len=str.length();
			for(int i=0;i<len;i++) {
				counter[(int)str.charAt(i)]++;
			}
			for(int i=0;i<256;i++) {
				if(counter[i]!=0) {
					System.out.println((char)i+"-->"+counter[i]);
				}
				
			}
		
		}
	static void getCount_HashMap (String str, int len) {
		HashMap<Character, Integer> charCount=new HashMap<>();
		int count=0;
		for(int i=0;i<len;i++) {
		if(charCount.containsKey(str.charAt(i))) {
			count=charCount.get(str.charAt(i));
			charCount.put(str.charAt(i), ++count);
			
		}else {
			charCount.put(str.charAt(i), 1);
		}
			
	}System.out.println(charCount);
	}
	
	static void getCount_Java8(String str, int len) {
		Map<Object, Long> result= Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		System.out.println(result); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static String removeSpace(String str) {
		String str2="";
		for (int i=0; i<str.length() ; i++) {
			if(str.charAt(i)==' ')
				continue;
			else
			str2=str2+str.charAt(i);
		
	} return str2;
}
}
	



		
