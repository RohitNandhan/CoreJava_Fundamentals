package PracticePrograms.coreJava.programs.numbers;

import java.util.Scanner;

public class ArmStrongNumber_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int result=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		num=sc.nextInt();
	    for(int i=1;i<=num;i++)
	    {
	    	int s=count(i);
	    //	System.out.println("s is"+s);
	    	switch(s)
	    	{
	    	case 1:
	    		result=armStrongNumbers(i,1);
	   // System.out.println("one digit"+i);
	    	break;
	    	case 2:
				result=armStrongNumbers(i,2);
	  //  		 System.out.println("two digit"+i);
	    		
		    	break;
	    	case 3:
				result=armStrongNumbers(i,3);
		    	break;
	    	case 4:
	    		result=armStrongNumbers(i,4);
		    	break;
	    	case 5:
				result=armStrongNumbers(i,5);
		    	break;
		    	
	    	}

//			armStrongNumbers(i,1);
	    	
	    	
	if(i==result)
		{
			 System.out.println(+result+" - is a ARMSTRONG NUMBER");
	}
	}
	   
	   

	}

	public static int armStrongNumbers(int i,int digit)
	{
		int r = 0;
		int sum=0;
		while(i!=0)
		{
			r=i%10;
			sum=(int)Math.pow(r,digit)+sum;
			i/=10;
		}
		return sum;
	}
	public static int onedigits(int i)
	{
	   int r = 0;
		int sum=0;
		while(i!=0)
		{
			r=i%10;
		sum=(r)+sum;		
		i/=10;	
	}
return sum;
}
   public static int twodigits(int i)
	{
	   int r = 0;
		int sum=0;
		while(i!=0)
		{
			r=i%10;
		sum=(r*r)+sum;		
		i/=10;	
	}
return sum;
}
   public static int threedigits(int i)
  	{
  	   int r = 0;
  		int sum=0;
  		while(i!=0)
  		{
  			r=i%10;
  		sum=(r*r*r)+sum;		
  		i/=10;	
  	}
  return sum;
  }
   public static int fourdigits(int i)
  	{
  	   int r = 0;
  		int sum=0;
  		while(i!=0)
  		{
  			r=i%10;
  		sum=(r*r*r*r)+sum;		
  		i/=10;	
  	}
  return sum;
  }
  
  public static int fivedigits(int i)
 	{
 	   int r = 0;
 		int sum=0;
 		while(i!=0)
 		{
 			r=i%10;
 		sum=(r*r*r*r*r)+sum;		
 		i/=10;	
 	}
 return sum;
 }
   
   public static int count(int num)
   {
int count = 0;
while (num!=0)
{
	//System.out.println("num is"+num );
	
	num/=10;
	count++;
	//System.out.println("count"+count);
}
return count;
}

}
