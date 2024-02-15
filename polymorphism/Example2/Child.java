package PracticePrograms.coreJava.polymorphism.Example2;

import Example1.Person;

public class Child extends Person {
	
	void newKid() {
	Child kid=new Child();
	
	System.out.println(Person.title);
	
	System.out.println(year);
	System.out.println(kid.year);
	
	printYear();
	kid.printYear();
	

}
}
