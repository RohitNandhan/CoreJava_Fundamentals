package Java2.Polymorpism;

public abstract class Bank {
	int getRateOfInterest() {
		return 5;
	}
	abstract void getInterest();
	

}

class SBI extends Bank{
	//@Override
	
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
	@Override
	void getInterest() {
		// TODO Auto-generated method stub
		System.out.println(SBI.class+" "+getRateOfInterest());
		
	}
}

class ICICI extends Bank{
	
	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 11;
	}
	@Override
	void getInterest() {
		// TODO Auto-generated method stub
		System.out.println(ICICI.class+" "+getRateOfInterest());
	}
}
