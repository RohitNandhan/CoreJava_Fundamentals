package PracticePrograms.coreJava.Inheritance;

public abstract class Bank {
	
	private String bankName;
	
	
	Bank(String bankName){
		this.bankName=bankName;
	}
	
	Bank(){
	//	this.bankName=bankName;
	}
		
	public String getBankName() {
		return bankName;
	}
	public static void main(String[] args) {
		Bank bank=new Office();
		System.out.println(bank.getBankName());
	}
}

class Office extends Bank{
	Office(){
		super();
	}
	
	
}
