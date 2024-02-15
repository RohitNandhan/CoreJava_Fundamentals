package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Program4  {
	
	Program4(){
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.retainAll(al2);
		System.out.println("iterating the elements after retaining"
				+ "the element of al2");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	
	}

}
