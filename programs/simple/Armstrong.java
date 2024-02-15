package programs.simple;

public class Armstrong {

	int temp, digit,last,sum;
	int n;
	/*
	 * An Armstrong number is an n-digit number that is 
	 * equal to the sum of the nth
	 * powers of its digits.
	 */
	
	public Armstrong() {
		// TODO Auto-generated constructor stub
		n=153;
		System.out.println();
		if(isArmstrong(n))
			System.out.println(n+" is Armstrong");
		else
			System.out.println(n+" is not Armstrong");
			
	}
	
	public Armstrong(int num) {
		
		this.n=num;
		System.out.println();
		if(isArmstrong(n))
			System.out.println(n+" is Armstrong");
		else
			System.out.println(n+" is not Armstrong");
	}
	public Armstrong(int start, int end) {
		
		for(int i=start;i<=end; i++)  {
			//function calling  
			if(isArmstrong(i)) {  
			//prints the armstrong numbers  
			System.out.print(i+ ", ");  
			}
		}

	}
	
	
	boolean isArmstrong(int number){
		this.sum=0;
		this.last=0;
		this.digit=0;
		this.temp=number;
		
		while(temp>0) {
			temp=temp/10;
			digit++;
			
		}
	
		temp=number;
	
		while(temp>0) {
			last =temp%10;
			sum+=(Math.pow(last, digit));
			temp=temp/10;
		}
		
		if (number==sum) {
			
			return true;
		}
		
		else 
			return false;
		
	}
	
	

}
