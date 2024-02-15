package Java2.Polymorpism;

public class BankMain {
	public static void main(String[] args) {
		Bank bank=new Bank();
		Bank sbi=new SBI();
		ICICI icici=new ICICI();
		
		
//		System.out.println(sbi.getRateOfInterest()+"\n"+
//		icici.getRateOfInterest());
		sbi.getInterest();
		icici.getInterest();
	}

}
