package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is rohitP nandhan naannaan\"";
		Object[] obj=mostFrequent(s);
		for(Object o:obj) {
			System.out.println(o);
		}
		
	}
	
	static Object[] mostFrequent(String str) {
		//for 
		char []ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char c:ch) {
			if(map.containsKey(c)) {
					map.put(c,map.get(c)+1);
					
			}else {
				map.put(c, 1);
			}
		}
		int count=0;
		char element=' ';
		for(Map.Entry<Character, Integer> entity:map.entrySet()) {
			char key=entity.getKey();
			int value=entity.getValue();
			int v=0;
			if(value>count) {
				element=key;
				count=value;
			}else if(value==count) {
				if(key<element) {
					element=key;
					count=value;
					
				}
			}
			
		}
		return new Object[]{element,count};
	}

}
