package enums;

public enum MessageType {
	A(Priority.HIGH),B(Priority.MEDIUM),C(Priority.LOW),D(Priority.LOW);
	
	Priority pr;
	MessageType(Priority pr){
		this.pr=pr;
	}
	Priority getPriority() {
		return this.pr;
	}
	
}
