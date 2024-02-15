package programs.simple;

public class PrimeNumbers {
	int m=0,flag=0, number=13;
	/*
	 * Prime number in Java: 
	 * Prime number is a number that is greater than 1 and
	 * divided by 1 or itself only
	 */
	public PrimeNumbers() {
		// TODO Auto-generated constructor stub
	
	int n=number;// no. to be checked
	m=n/2;
	if(n==0||n==1) {
		System.out.println(n+"is not prime number");
	}
	else {
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n +"is not prime number");
				flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println(n +"is prime number");
			} }//end of else
	
	}
	
	public PrimeNumbers(int num) {
		// prime number for non predefined numbers
		if(isPrime(num)) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num +" is not prime number");
		} }
	boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		int count=(int)Math.sqrt(n);
		//System.out.println(count);
		for(int i=2;i<=count; i++) {
		
			if(n%i==0) {
				return false;
			}
		}return true;
		
	}
	
	public PrimeNumbers(int start, int end) {
		//Find prime numbers between two numbers
		System.out.println("List of prime numbers between"
				+start+" and "+ end );
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}
		
	}
}

