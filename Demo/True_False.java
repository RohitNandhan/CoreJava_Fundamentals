package Demo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class True_False {

	public static void main(String... arg) throws IOException, InterruptedException {
        
		Random random= new Random();
		
	   while(true) {
		boolean m=random.nextBoolean();
		System.out.println("Enter your Question...?");
		Scanner sc=new Scanner(System.in);
		String Qs=sc.nextLine();
		Qs.toUpperCase();
		System.out.println("....Checking True / False...");
		System.out.println();
		if(m)
		{
			System.out.println(Qs+" is : "+m);
		}
		else
		{
			System.err.println(Qs+" is : "+m);
		}
	   System.out.println();
	   }
	}
	}
	
