package PracticePrograms.coreJava.Inheritance;

class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A b=new B();
		//new A();
		b.display();
	}
}
	
 class A{
		int x=10;
		A(){
			System.out.println("A constructor");
		}
		void display() {
			System.out.println("display: x: "+x);
		}
	}
	
 class B extends A{
		int x1=20;
		
		B(){
		super();
			
			System.out.println("B constructor");
			
		}
		void display() {
			System.out.println(+x+10 );
		}
	}


