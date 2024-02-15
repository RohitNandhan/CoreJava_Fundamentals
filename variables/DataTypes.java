package variables;

public class DataTypes {
	/*
	 *  include boolean, char, byte, short,
	 *  		 int, long, float and double
	 */
	
	Boolean one = false  ;
	byte by1 =-128,by= 127;
	short sh1=-32768,sh2= 32767;
	int in1 = - 2147483648 , in2 =2147483647 ;
	long lg1 = 100000L ,lg2 = -200000L  ;
	float f1 = 0.0f,f2= 234.5f   ;// unlimited 32-bit single precision
	double d1 = 12.3, d2= 122222222122221222222222222222221111111111111111234.5 ;// unlimited 64-bit double precision
	char letterA = 'A' ;// \u0000 is the lowest range of Unicode system

}

class PrimitiveDataTypes extends DataTypes
{
	/*
	 *  include boolean, char, byte, short,
	 *  		 int, long, float and double
	 */
	
	Boolean one = false  ;
	int a = 100000, b = -200000;  
	float f1 = 234.5f  ;
	double d1 = 12.3  ;
	char letterA = 'A' ;// lowest value:\u0000 highest value:\uFFFF 


}

class NonPrimitiveDataTypes extends DataTypes {
	/* include Classes, Interfaces, and Arrays. */
	
	
	
}