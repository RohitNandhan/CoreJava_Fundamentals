package PracticePrograms.coreJava.Inheritance;

interface A{}

class C implements A{}

class D extends C {}

class B  extends D{}

public class Test extends Thread{
	public static void main(String[] args) {
		C b=new B();
		if(b instanceof A)
			System.out.println("b is an instatnce of A");
		if(b instanceof C)
			System.out.println("b is an instance of C");
	}

}
