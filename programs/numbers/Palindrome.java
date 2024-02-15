package programs.numbers;

public class Palindrome {
	
	public Palindrome() {
		// TODO Auto-generated constructor stub
		
		// get input 
		// convert to rev
		// check equality
		
		int r, rev=0, temp;
		int n=454;
		temp=n;
		while(temp>0) {
			r=temp%10;
			rev=rev*10+r;
			temp/=10;
		}
		if(n==rev) {
			System.out.println("the number "+n+" is palindrome");
		}else {
			System.out.println("the number "+n+" is not palindrome");
		}
	}
	
	public Palindrome(int n) {
		// TODO Auto-generated constructor stub
		
		// get input 
		// convert to rev
		// check equality
		
		int r, rev=0, temp;
		
		temp=n;
		while(temp>0) {
			r=temp%10;
			rev=rev*10+r;
			temp/=10;
		}
		if(n==rev) {
			System.out.println("the number "+n+" is palindrome");
		}else {
			System.out.println("the number "+n+" is not palindrome");
		}
	}
	

}
