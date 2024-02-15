package programs.simple;

public class FibanacciSeries {
	
	/*
	 * it is the series, the next number is 
	 * the sum of prev two numbers
	 */
	int n1=0,n2=1,n3,i,count=10;
	
	public FibanacciSeries() {
		// TODO Auto-generated constructor stub
	
		System.out.println(n1+"\n"+n2);//printing 0 and 1
		
		for(i=2;i<count;++i) {
			//loop starting with 2 as 0 and 1 r already printed
			n3=n2+n1;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}
	public FibanacciSeries(int count) {
		// Using Recursion 
		System.out.println(n1+"\n"+n2);
		printFibonacci(count-2);
	}
	
	void printFibonacci(int count) {
	
		this.count=count;
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			printFibonacci(count-1);
			
		}
		
	
		
	}
}
