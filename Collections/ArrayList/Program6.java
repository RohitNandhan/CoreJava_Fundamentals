package Collections.ArrayList;

import java.util.ArrayList;

public class Program6 {
		//ways to remove an element
	Program6(){
		ArrayList<String> al=new ArrayList<>();
		al.add("Vijay");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		
		for(String str:al) {
			if (str.matches("Vijay")) {
				System.out.println(str);
			}
		}
	}

}
