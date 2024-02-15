package controlFlow;

public class LoopStatement {
	public LoopStatement() {
		// TODO Auto-generated constructor stub
		/*
		 * loop statements are used to execute 
		 * the set of instructions in a repeated
		 * order
		 */
	}
}
class ForLoop extends LoopStatement{
	/*
	 * It enables us to initialize the loop variable, check the condition, and
	 * increment/decrement in a single line of code
	 */
	public ForLoop() {
		// TODO Auto-generated constructor stub
		int sum=0;
	for(int j=1;j<=10;j++) {
		sum=sum+j;
		
	} System.out.println("The sum of first 10 natural numbers is"+sum);
	}
}

class ForEachLoop extends LoopStatement{
	/*
	 * enhanced for loop to traverse 
	 * the data structures like array or collection
	 */
	public ForEachLoop() {
		// TODO Auto-generated constructor stub
	String[] names= {"Java","C","C++","Python","JavaScript"};
	System.out.println("Printing the content of the array names:\n");
	for(String name: names) {
		System.out.println(name);
	}	
	}
}

class WhileLoop extends LoopStatement {
	/*
	 * It is also known as the entry-controlled loop 
	 * since the condition is checked
	 * at the start of the loop
	 */
	public WhileLoop() {
		// TODO Auto-generated constructor stub
	int i=0;
	System.out.println("Printing the list 10 even numbers \n");
	while(i<=10) {
		System.out.println(i);
		i=i+2;
	}
	}
}
class Do_WhileLoop extends LoopStatement{
	/*
	 * It is also known as the exit-controlled loop since the condition is not
	 * checked in advance
	 */
	public Do_WhileLoop() {
		// TODO Auto-generated constructor stub
		int i=0;
		System.out.println("Printing the list of first 10 even numbers\n");
		do {
			System.out.println(i);
			i=i+2;
		}while(i<10);
		
	}	
}

class JumpStatements extends LoopStatement {
	/*
	 * ,used to transfer the control of the program
	 *  to the specific statements */
}
class BreakStatement extends JumpStatements{
	/*
	 * the break statement is used to break the current flow of the program and
	 * transfer the control to the next statement outside a loop or switch statement
	 */
	public BreakStatement() {
		// TODO Auto-generated constructor stub
//		for( int i=0;i<=10;i++) {
//			System.out.println(i);
//		 if(i==6) {
//			break;
//		}
//		}
		
		a:for(int i=0;i<=10;i++) {
			b:for(int j=0;j<=15;j++) {
				c:for(int k=0;k<=20;k++) {
					System.out.println(k);
				if(k==5) {
					break a;}
				}
			}
		}
	
	}
}

class ContinueStatement extends JumpStatements{
/*
 * skips the specific part of the loop and jumps to the next iteration of the
 * loop immediately
 */
	public ContinueStatement()
{
	a:for(int i=0; i<=2;i++) {
		b:for(int j=i;j<=5;j++) {
			if(j==4) {
				continue a;
			} System.out.println("J:"+j);
		}
	}
}
}

