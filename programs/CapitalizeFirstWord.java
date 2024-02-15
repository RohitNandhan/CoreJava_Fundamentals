package PracticePrograms.coreJava.programs;

import java.util.Scanner;

public class CapitalizeFirstWord {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		System.out.println("output string :\n "+getCapitalize(str));
	//	System.out.println("output string :\n "+getCapitalize(str, 0));
		
		
	}
	// Created by RN
	static String getCapitalize(String str) {
		String str1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			
			if(i==0 ) {
				
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
				else if(str.charAt(i)==' ') {
					sb.append(' ');
					sb.append(Character.toUpperCase(str.charAt(++i)));
				}
				else
				{
					sb.append(str.charAt(i));	
			}
		}
		str1=sb.toString();
		return str1;
	}
	//using split and substring method
//	static String getCapitalize(String str, int len) {
//		String words[]=str.split("\\s");
//		String capitalizeWord="";
//		for(String w:words) {
//			String first=w.substring(0,1);
//			String afterfirst=w.substring(1);
//			capitalizeWord+=first.toUpperCase()+afterfirst+" ";
//			
//		}
//		return capitalizeWord.trim();
//		
//	}

}
