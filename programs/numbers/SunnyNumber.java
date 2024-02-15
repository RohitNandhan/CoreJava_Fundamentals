package programs.numbers;

public class SunnyNumber {

	public SunnyNumber(int x) {
		// TODO Auto-generated constructor stub
		
		int y=x+1;
		double root=Math.sqrt(y);
		
		if (findPerfectSquare(root)==true)
		System.out.println("The given number "+x+" is Sunny number" );
		else
			System.out.println("The given number "+x+" is not Sunny number" );
		
	}
	
	
	/** 
	 * @param num
	 * @return boolean
	 */
	public boolean findPerfectSquare(double num) {
		return ((num)-Math.floor(num)==0);
	}
}
