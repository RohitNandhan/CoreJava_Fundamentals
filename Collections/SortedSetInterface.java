package Collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface extends CollectionFramework{

		/*
		 * The SortedSet provides the additional methods that inhibit the natural
		 * ordering of the elements.
		 * SortedSet<data-type> set = new TreeSet();  
		 */
	SortedSet<String> ss;
	
	public void sortedSetIterator() {
		Iterator<String> itr=ss.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void printElement(){
		for(String st:ss) {
			System.out.println(st);
		}
	}
	}

class Tree_set extends SortedSetInterface{
	/*
	 * the access and retrieval time of TreeSet is quite fast TreeSet stored in
	 * ascending order unique elements
	 */
	public Tree_set() {
		// TODO Auto-generated constructor stub
	
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Ravi");
	ts.add("Vijay");
	ts.add("Ravi");
	ts.add("Ajay");
	
	this.ss=ts;
	printElement();

	}
}

