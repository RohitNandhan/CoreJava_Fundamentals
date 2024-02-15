package lamdaExpression;

public class Example2 {

	//Java Lambda Expression Example: No Parameter
	public Example2() {
		// TODO Auto-generated constructor stub
		Sayable s=()->{
			return "i have nothing to say";
		};
		
		System.out.println(s.say());
		
	}
}

interface Sayable {
	public String say();
}