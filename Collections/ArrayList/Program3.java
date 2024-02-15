package Collections.ArrayList;

import java.util.ArrayList;

public class Program3 {
		//ways to remove an element
	Program3(){
		ArrayList<String> al=new ArrayList<>();
		al.add("Vijay");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		
		System.out.println("An initial list of element: "+al);
		
		///removing Specifi element from the arraylist

		al.remove("Vijay");
		System.out.println("After invoking remove(obj) method"+al);
		
		//remove element basis of position
		al.remove(0);
		System.out.println("After invoking remove(index) method:"+al);
		
		//creating another arraylist
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.addAll(al2);
		System.out.println("Update list: "+al);
		
		//removing all the new elements from arraylist
		al.removeAll(al2);
		System.out.println("After invoking removeAll()method"+al);
		
		al.removeIf(str->str.contains("Ajay"));
		System.out.println("After invoking the removeIf() method"+al);
		
		al.clear();
		System.out.println("After invoking clear() method"+al);
	}

}
