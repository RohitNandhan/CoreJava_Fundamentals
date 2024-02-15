package Java2.Polymorpism;

public class OverridingStaticMethod {
	public static void main(String[] args) {
		A a=new B();
			System.out.println(a.abc());
			System.out.println(a.abc());
			A a1=new A();
			System.out.println(a1.abc());
			System.out.println(a.abc());
			System.out.println(a1.abc());
		
	}
	

}

class A{
	 int a=1;
	 int abc() {
		
		return a++;
	}
}

class B extends A{
//	static int abc() {
//		return 3;
//	}
}
