package Collections.ArrayList;

import java.util.ArrayList;

public class Program2 {

	//ways to add elecments to arrayList
	Program2(){
		
		ArrayList<String> al=new ArrayList<>();
		System.out.println("Initial list of elements:"+al);
		
		al.add("Rohit");
		al.add("Dhanush");
		al.add("Ajay");
		
		System.out.println("After invoking add(E e)method "+al);
		
		al.add(1,"Nandhan");
		System.out.println("After invoking add(int index,E element) "
				+ "method: "+al);
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Andrews");
		al2.add("Mani");
		al.addAll(al2);
		System.out.println("After invoking addAll "
				+ "(Collection<?extends E>c) method:"+al);
		
		ArrayList<String> al3=new ArrayList<>();
		al3.add("Prashant");
		al3.add("Elavarasan");
		al3.add("Senthil");
		
		al.addAll(1,al3);
		System.out.println("After invoking "
				+ "addAll(int index,Collection<?extends E>c)method"+al);
	}
	
}
