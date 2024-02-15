package Inheritance;

public class Main {
	public static void main(String args[]){
        C obj=new C();
        obj.msg(); //Now which msg() method would be invoked?

	}
}

class A{
    void msg(){System.out.println("Hello");}
}

class B extends A{
    void msg(){System.out.println("Welcome");}
}

class C extends B{

     
}
