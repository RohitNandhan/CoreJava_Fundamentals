package randomNumber;

public class MainClass {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Examples eg =new Examples();
		eg.example1();
		eg.exampleUsingMathFun(1000,9999);
		eg.exampleUsingRandomClass(1000000);
		eg.exampleUsingThreadLocalClass();
		Examples.randomInts(3);
		Examples.randomInts(3, 0, 9);
	}

}
