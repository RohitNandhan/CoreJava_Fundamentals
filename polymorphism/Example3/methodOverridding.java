package Java2.Polymorpism;

public class methodOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base=new Derived();
		base.methodOne();

	}

}

class Base {
	
	public void methodOne() {
		System.out.println("A");
	}
	
	public void methodTwo() {
		System.out.println("B");
	}
	
}

class Derived extends Base{
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		super.methodOne();
		System.out.println("C");
	}
	
	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("D");
		super.methodTwo();
		
	}
}

