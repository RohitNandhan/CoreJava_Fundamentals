package stream;

import java.util.List;

public class Employee implements Comparable<Employee> {
	String name;
	List<String> address;
	int age;
	String role;
	public Employee(String name, List<String> address, int age, String role) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.role = role;
	}
	
	/** 
	 * @param o
	 * @return int
	 */
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	


}
