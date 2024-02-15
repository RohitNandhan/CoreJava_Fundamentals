package Collections.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Integer[] a= {2,1,1,2,3,4,5};
		Integer[] b= {2,1,1,2,2};
		List<Integer> l1=new ArrayList<>(Arrays.asList(a));
		List<Integer> l2=new ArrayList<>(Arrays.asList(b));
		
		System.out.println(intersection(a.length, l1, b.length, l2));
		
		
	}
	
	static List<Integer> intersection(int n,List<Integer>a, int m, List<Integer> b){
			
				// traverse through 2 list
		//if( == then  , add to DS
		//print DS\
		
		Map<Integer, Integer> map=new HashMap<>();
		for(int x:a) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}else {
				map.put(x,1);
			}
		}
		List<Integer> ls=new LinkedList<>();
		for(int y:b) {
			if(map.containsKey(y) && map.get(y)>0) {
				ls.add(y);
				map.put(y,map.get(y)-1);
				
			}
		}
		
		
//		for(int x:a) {
//				for(int y:b) {
//					if(a==b) {
//						map.put( , null)
//						
//					}
//				}
//		}
//		
		
		Collections.sort(ls);
		
		return ls;
	}

}
