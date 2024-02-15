package lamdaExpression;

public class Example3 {
	//Java Lambda Expression Example: Multiple Parameters
	public Example3() {
		// TODO Auto-generated constructor stub
		
		Addable ad=(a, b)->{
			return a+b;
		};
		Addable ad2=(a,b)->(a+b);
		
		System.out.println("ad="+ad.add(4, 5));
	}
}

interface Addable{
	int add(int a, int b);
	//String name(String name);
}
