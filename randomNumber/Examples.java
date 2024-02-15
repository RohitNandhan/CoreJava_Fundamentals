package randomNumber;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Examples {

	void example1() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++)
		{
		System.out.println();
		System.out.println("random number: "+Math.random());
		
	}
	}
		
		/** 
		 * @param min
		 * @param max
		 */
		void exampleUsingMathFun(int min,int max) {
			// TODO Auto-generated method stub
			
			for(int i=0;i<3;i++)
			{
			System.out.println();
			System.out.println("random number b/w "+min+"and"+max+":- "+(int)(Math.random()*(max-min+1)+min));
			
		}
	}
		void exampleUsingRandomClass(int range) {
			// TODO Auto-generated method stub
			
			Random random =new Random();
			
			for(int i=0;i<3;i++)
			{	
			System.out.println("Boolen"+random.nextBoolean());
			System.out.println("-------random number range 0 to "+ range+":-"+random.nextInt(range));
			
		}
	}
		void exampleUsingThreadLocalClass() {
			// TODO Auto-generated method stub
			
			for(int i=0;i<3;i++)
			{	
			System.out.println();
			System.out.println("random number range "+ThreadLocalRandom.current().nextInt());
			System.out.println("random number range "+ThreadLocalRandom.current().nextDouble());
			
		}
	}
		public static void randomInts(int num)   
		{  
		Random random = new Random();  
		random.ints(num).forEach(System.out::println);  
		}  
		//method that generates a stream of 9 integers between 50 to 90  
		public static void randomInts(int num, int origin, int bound)   
		{  
		Random random1 = new Random();  
		random1.ints(num, origin, bound).forEach(System.out::println);  
		}  

	
		
	
}
