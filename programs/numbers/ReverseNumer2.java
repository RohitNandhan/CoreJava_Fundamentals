package programs.numbers;

public class ReverseNumer2 {
	
	public ReverseNumer2() {
		// TODO Auto-generated constructor stub
	
	int number=123456,rev = 0;
	for(;number!=0;number/=10) {
		int remainder =number %10;
		rev=rev*10+remainder;
	}
	System.out.println("The reverse of the given number is: "+rev);
}
}
