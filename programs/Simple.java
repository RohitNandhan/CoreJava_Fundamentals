
package PracticePrograms.coreJava.programs;

import java.math.BigInteger;

public class Simple {
	
	public static void main(String[] args) {
		byte b= (byte) (Byte.MAX_VALUE+1);
		int a=Integer.MAX_VALUE+1;
		double d=Double.MAX_VALUE+2;
		//System.out.println(b);
		BigInteger largeValue = new BigInteger(Integer.MAX_VALUE + "");
		if(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE) {
			System.out.println("true");
		}else {
				System.out.println("false");
			}
		}
	

}
