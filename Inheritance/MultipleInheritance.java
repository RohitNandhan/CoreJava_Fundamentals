package PracticePrograms.coreJava.Inheritance;

public class MultipleInheritance {
 public static void main(String[] args) {
	 
	 
 }
 
 
 
}

class A1 {
	public void methodA() {
		System.out.println("Class A method");
	}
	
}

class B2 extends A1{
	public void methodB() {
		System.out.println("class B method");
	}
	
}

class C extends B2{
	public void methodC() {
		System.out.println("class C method");
	}
	
}

