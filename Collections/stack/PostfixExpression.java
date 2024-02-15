package Collections.stack;

import java.util.Stack;

public class PostfixExpression {

	public static void main(String[] args) {
		String str="2 4 3 + *";
		
		int i=postfixExp(str);
		System.out.println(i);
	}
	static boolean isOperator(String s1) {
		if(s1.contains("+") || s1.contains("-") || s1.contains("*"))
		return true;
	
	return false;
	}
	
	private static int evalute(String s1, int op1, int op2) {
		// TODO Auto-generated method stub
		switch(s1) {
		case "+":
			return op1+op2;
		case "-":
			return op1-op2;
		case "*":
			return op1*op2;
		default:
			return -1;
		}
		
	}
	
	public static int postfixExp(String str) {
		
		Stack<Integer> st=new Stack<>();
		int op1=0,op2=0;
		String s[]=str.split(" ");
		for(String s1:s) {
		
			//if operator , evaluate
			//else push to stack
		if(isOperator(s1)) {
			op2=st.pop();
			op1=st.pop();
			int value=evalute(s1,op1,op2);
			st.push(value);
			
			}
			
		else {
			st.push(Integer.parseInt(s1));
			
			
		}
		}
		return st.pop();
	}
	

}
