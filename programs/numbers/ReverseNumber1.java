package programs.numbers;

public class ReverseNumber1 {

	public ReverseNumber1() {
		// TODO Auto-generated constructor stub
		int number =987654,reverse = 0;
		while(number!=0) {
			int remainder =number %10;
			reverse =reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("Reverse of the given is :"+reverse);
			
			
		
	}
}
