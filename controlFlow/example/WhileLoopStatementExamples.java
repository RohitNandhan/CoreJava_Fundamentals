package controlFlow.example;

public class WhileLoopStatementExamples {

	public WhileLoopStatementExamples() {
		// TODO Auto-generated constructor stub
	System.out.println("While Loop Statement Example");
	
	}
}
class WhileExample extends WhileLoopStatementExamples{
	public WhileExample() {
		// TODO Auto-generated constructor stub
	int i=1;
	while(i<=10) {
		System.out.println(i);	
	i++;
	}
}
}

class DoWhileExample extends WhileLoopStatementExamples{
	public DoWhileExample(){
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
	}
}