package Collections.ArrayList;

import java.util.ArrayList;

public class SizeCapacity {

	public SizeCapacity() {
		// TODO Auto-generated constructor stub
		ArrayList<String> al=new ArrayList<>();
		System.out.println("The size of the array is:"+al.size());
		//the default capacity of the array list is 10.
		
		ArrayList<String> al1=new ArrayList<>(10);
		System.out.println("The Size of the array is: "+al.size());
		/*
		 * We see that the size is still 0, and the reason behind this is the number 10
		 * represents the capacity no the size
		 */}
}
