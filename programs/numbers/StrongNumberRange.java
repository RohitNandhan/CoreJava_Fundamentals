
package PracticePrograms.coreJava.programs.numbers;

import java.util.Scanner;

public class StrongNumberRange {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		//int result=0;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		num=sc.nextInt();
		System.out.println("STRONG NUMBERS IN RANGE " +num+ " :- \n");
	    for(int i=1;i<=num;i++)					//loops range
	    {
	    	logicStrongNum(i);					//fun call
	    }
	    sc.close();
}
	private static void logicStrongNum(int temp) {
		int result=strongNum(temp);				//calling StrongNum
		if (temp==result)						//condition for Strong Number
		{
			System.out.println("\n"+result);
		}	
	}
	private static int strongNum(int num) { 			//		Spliting Digits
		int sum=0;
		while(num!=0)
		{
		int r=num%10;
		sum+= fact(r);							//calling method fact
		num/=10;
		}
		return sum;
	}
	private static int fact(int r) {				//factorial executed
			if(r>0)
			return r*fact(r-1);
		return 1;
	}
}
