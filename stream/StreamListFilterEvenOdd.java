package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamListFilterEvenOdd {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lst=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//List<Integer> odd=lst.stream().filter(e->(e%2!=0)).collect(Collectors.toList());
		lst.remove(0);
	//	lst.removeAll(odd);
	//	System.err.println(odd);
		System.err.println(lst);
	}

}
