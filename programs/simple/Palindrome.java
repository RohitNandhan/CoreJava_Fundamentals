package programs.simple;

public class Palindrome {

	/*
	 * A palindrome number is a number that is 
	 * same after reverse
	 */
	int r,sum=0,temp;
	int n=454;
	
	public Palindrome() {
		// TODO Auto-generated constructor stub
		temp=n;
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(n==sum) System.out.println("palindrome number");
		else System.out.println("not  palindrome");
		
	}
	public Palindrome(Object n) {
		String temp=(String) n;
		String reverse = "";
		int len=temp.length();
		for(int i=len-1;i>=0;i--) {
			
			reverse= reverse + temp.charAt(i);	
		}
		if(reverse.equals((String)n))
			System.out.println(n+ " is palindrome");
		else
			System.out.println(n+ " not plaindrome");
		
	}
	
		
}


