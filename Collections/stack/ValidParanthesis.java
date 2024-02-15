package Collections.stack;

import java.util.Stack;

public class ValidParanthesis {
	public static void main(String[] args) {
		
	
	String str= "{}{(}))}";
	boolean valid=validParanthesis(str);
	System.out.println(valid);
	
	}
	
	public static boolean validParanthesis(String str) {
		
		//stack impl
		//if open brack push
		//if close brac , compare with top of the stack
			// if equals pop it
		//else 
			//invalid
		char ch[]=str.toCharArray();
		
		Stack<Character> st=new Stack<>();
		for(char c:ch) {
			if(c=='(' || c=='{' || c=='[' || c=='<') {
				//System.out.println(c);
				st.push(c);
			}
			else {
				if(st.empty()) {
					return false;
				}
				else {
					char top=st.peek();
					if(top=='(' && c==')' || top=='{' && c=='}'
							|| top=='[' && c==']' || top=='<' && c=='>') {
						st.pop();
						
					}else {
						return false;
						
					}
				}
				
			}
		}
		
		return ((st.isEmpty())? true:false);
	}
}
