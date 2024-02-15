package Collections.HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapImp {
	
	public static void main(String [] args) {
		MapImpl();
		String s ="10201";

		
	}
		static void MapImpl() {
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(100, "Amit");
		map.put(101,"Vijay");
		map.put(102, "Rahul");
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()). forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+map.get(m.getKey()));
			
		}
	
	}
		static void HashMapImpl() {
			HashMap<Integer,String> hmap=new HashMap<>();
			hmap.put(1,"mango");
			hmap.put(2,"apple");
			hmap.put(3, "banana");
			hmap.put(4, "grapes");
			
			System.out.println("Iterating Hashmap");
			
			for(Map.Entry m:hmap.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
				
			}
			
		}
		
		static void HashMapImpl2() {
			HashMap<Integer,String> hmap=new HashMap<>();
			hmap.put(1,"car");
			hmap.put(2, "bike");
			hmap.put(3,"auto");
			hmap.put(1, null);
			
	
			
		}

}
