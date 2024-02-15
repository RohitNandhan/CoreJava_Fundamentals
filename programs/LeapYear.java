package PracticePrograms.coreJava.programs;

import java.util.Scanner;

public class LeapYear {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		
		//System.out.println(""+year+" is leap year :"+findYear(year));
		System.out.println(""+year+" is leap year :"+findLeapyear(year));
		
		
	}
	static boolean findYear(int year) {
		if(year%400==0 | (year%4==0 && year%100!=0)) 
		return true;
		else
		return false;
		
	}
	static boolean findLeapyear(int year) {
		
		if(year%4==0) {
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) 
						return true;
					else
						return false;
					
				}
				else 
					return true;
			}
		}
		
		return false;
	}

}
