package enums;

public enum Types {

	A,B,C,D;
	Priority pr;
	
	Types(){
	}
	
	Priority getPriority(){
		A.pr=Priority.HIGH;
		B.pr=Priority.MEDIUM;
		C.pr=Priority.LOW;
		D.pr=Priority.HIGH;
	
		
		return this.pr;
	}
	
}
