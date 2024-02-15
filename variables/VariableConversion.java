package variables;

public class VariableConversion {

	VariableConversion(String string){
		int int_a=10; 
		float float_a=11;
		float fl=int_a; 
		int in=(int) float_a;
		int b=256;
		byte b1=(byte)b;
		
		System.out.println("\n"+string);
		System.out.println("printing int_a = "+ int_a
				+"\nprinting float_a = "+float_a);  
		System.out.println("widening conversion "
				+ "int to float ="+fl); 
		System.out.println("Narrowing conversion "
				+ "float to int ="+in); 
		System.out.println("overfolw conversion "
				+ "int to byte \n"
				+""+b1); 
			
	}
}
