package programs.simple;

public class Factorial {

	/*
	 * Factorial of n is the product of
	 *  all positive descending integers
	 */
	int number=5;
	int fact=1;
	
	public Factorial() {
		// TODO Auto-generated constructor stub
	
	
	for(int i=1;i<=number;i++) {
		fact=fact*1;
		
	}
	System.out.println("Factorial of "+number +"is:"+fact);
	
	}
	
	public Factorial(int n)
	{
		number=n;
		fact=factorial(number);
		System.out.println("Factorial of "+number+" is: "+fact);    
	}

	private int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		else
		return (n*factorial(n-1));
	}
	
}