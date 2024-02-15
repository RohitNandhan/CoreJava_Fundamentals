package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedClassObjectInArrayList {
	
	
	
	public UserDefinedClassObjectInArrayList() {
		// TODO Auto-generated constructor stub
		
		Student s1=new Student(001, "AAA", 21);
		Student s2=new Student(002, "BBB", 22);
		Student s3=new Student(003, "CCC", 23);
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			//System.out.println(st);
			System.out.println(st.rollno+" "+st.name+" "+st.age);
			}
		
	}

}

class Student{
	
	int rollno,age;
	String name;
	
	public Student(int rollno,String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.age=age;
		this.rollno=rollno;
		this.name=name;
	}
	
}