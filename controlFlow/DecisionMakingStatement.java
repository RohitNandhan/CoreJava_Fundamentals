package controlFlow;

public class DecisionMakingStatement {

	/*
	 * Decision-making statements evaluate the Boolean expression and control the
	 * program flow depending upon the result of the condition provided
	 */
	
}

class If_Statement extends DecisionMakingStatement{
	
	/*
	 * the "if" statement is used to evaluate a condition
	 */

}
class Simple_If extends If_Statement
{
	public Simple_If() {
		// TODO Auto-generated constructor stub
		/*if (Simple_If.class!=null)
		{
			System.out.println("class is not null");
			
		}
		*/
		int x=10;
		int y=12;
		if(x+y>20) {
			System.out.println("x+y is greater than 20");
		}

				
	}
}

class If_Else extends If_Statement{
	public If_Else() {
		// TODO Auto-generated constructor stub
		int x=10;
		int y=12;
		if(x+y<10) {
			System.out.println("x+y is less than 10");
		}
		else {
			System.out.println("x+y is greater than 10");
		}
	}

}
class If_ElseIf_Ladder extends If_Statement
{
	public If_ElseIf_Ladder() {
		// TODO Auto-generated constructor stub
	
	String city="Delhi";
	if(city=="Meerut") {
		System.out.println("city is Meerut");
	} else if(city == "Noida" ){
		System.out.println("city is Noida");
	}else if(city=="Agra") {
		System.out.println("city is Agra");
		
	}else {
		System.out.println("city is Delhi");
	}
	}
}
class Nested_If extends If_Statement{
	public Nested_If() {
		// TODO Auto-generated constructor stub
	String address="Delhi, India";
	
	if(address.endsWith("India")) {
		if(address.contains("Meerut")) {
			System.out.println("Your city is Meerut");
		}else if(address.contains("Noida")) {
			System.out.println("your city is Noida");
		}else {
			System.out.println(address.split(",")[0]);
		}
	}else {
		System.out.println("you are not living in India");
	}
	}
}
class SwitchStatement extends DecisionMakingStatement{
	
	public SwitchStatement() {
		int num=2;
		switch(num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 1:
			System.out.println("number is 1");
			break;
		default:
			System.out.println(num);
		}
	}
}

	
