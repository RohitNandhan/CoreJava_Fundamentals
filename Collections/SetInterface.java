package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface extends CollectionFramework {
	
	/**
	 * It represents the unordered set of elements which doesn't allow us to store
	 * the duplicate items We can store at most one null value implemented by
	 * HashSet, LinkedHashSet, and TreeSet.
	 * 
	 * @provides
	 * 	Set<data-type> s1 = new HashSet<data-type>();  
		Set<data-type> s2 = new LinkedHashSet<data-type>();  
		Set<data-type> s3 = new TreeSet<data-type>();  

	 */
	public void setIterator(Set<String> set) {
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		}
	public void printElements(Set<String> set) {
		for(String st: set)
			System.out.println(st);
		
	}
	
}

class Hash_Set extends SetInterface{
	/*
	 * It represents the collection that uses a hash table for storage. Hashing is
	 * used to store the elements in the HashSet. It contains unique items
	 */
	public Hash_Set() {
		// TODO Auto-generated constructor stub
		
		HashSet<String> hs=new HashSet<>();
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Ravi");
		hs.add("Ajay");
		hs.add(null);
		hs.add("salem");
		
		printElements(hs);
	}
}

class LinkedHash_set extends SetInterface{
	/*
	 * It also contains unique elements. It maintains the insertion order and
	 * permits null elements
	 */
	public LinkedHash_set() {
		// TODO Auto-generated constructor stub
		Set<String> ls=new LinkedHashSet<>();
		ls.add("Ravi");
		ls.add("Vijay");
		ls.add(null);
		ls.add(null);
		ls.add("rohan");
		
		setIterator(ls);
		
	}
}


