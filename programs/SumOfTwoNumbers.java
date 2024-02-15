package PracticePrograms.coreJava.programs;

import java.util.Random;

public class SumOfTwoNumbers {
	
	 
	 /** 
	  * @param args
	  */
	 public static void main(String[] args) {
		
	
		// TODO Auto-generated constructor stub
	
		int a, b;
		Random ran=new Random();
		a=ran.nextInt(-90,90);
		b=ran.nextInt(-90, 90);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		int sum= a+b;
		
		System.out.println("sum:"+sum);
		
		
	}

}
