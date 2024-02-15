package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface extends CollectionFramework{
	
	/*
	 * List interface is the child interface of Collection interface. It inhibits a
	 * list type data structure in which we can store the ordered collection of
	 * objects. It can have duplicate values
	 */
//	List <data-type> list1= new ArrayList();  
//	List <data-type> list2 = new LinkedList();  
//	List <data-type> list3 = new Vector();  
//	List <data-type> list4 = new Stack();  
	
	public void ListIterator(List list){
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
	}
	
	public void Sorting(List lst) {
		
		Collections.sort(lst);
	}

	
}

class Array_List extends ListInterface{
	
	/*
	 * dynamic array to store the duplicate element maintains the insertion order
	 * and is non-synchronized elements stored in the ArrayList class can be
	 * randomly accessed
	 */
	
	public Array_List() {
		// TODO Auto-generated constructor stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		Sorting(al);
		ListIterator(al);
		
	}
	
}
class Linked_List extends ListInterface{
	
	/*
	 * uses a doubly linked list internally to store the elements It can store the
	 * duplicate elements. It maintains the insertion order the manipulation is fast
	 */
	
	public Linked_List() {
		// TODO Auto-generated constructor stub
	
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ravi");
		ll.add("Ajay");
		
		ListIterator(ll);
	
	
	}
}

class Vectro_List extends ListInterface{
	
	/*
	 * Vector uses a dynamic array to store the data elements, It is synchronized and
	 * extra methods to implement
	 */
	
	
	public Vectro_List() {
		// TODO Auto-generated constructor stub
	Vector<String> vc=new Vector<>();
	vc.add("Ayush");
	vc.add("Amit");
	vc.add("Ashish");
	vc.add("Garima");
	
	ListIterator(vc);
	
	}
}

class Stack_List extends ListInterface{
	
	/* last-in-first-out data structure
	 * The stack contains all of the methods of Vector class  */
	
	
	public Stack_List(){
		
		Stack<String> st =new Stack<>();
		st.push("Ayush");
		st.push("Garvit");
		st.push("Amit");
		st.push("Ashish");
		st.push("Garima");
		
		
		ListIterator(st);
		
	}
}




