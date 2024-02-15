package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCLoning {
	
	public ArrayListCLoning() {
		// TODO Auto-generated constructor stub
		
		ArrayList<Object> arr=new ArrayList<>();
		ArrayList arr1=arr;
		
		ArrayList <ArrayList<Object>> arr2=new ArrayList<>();
	//	arr.add("ramu");
		arr.add(12);
		arr.add(12);
		arr.add(3);
		arr1.add(5);
		arr2.add(arr);
	ArrayList<Object> oba=	new ArrayList<>();
//		add(2); 
//		add("3");
	
		//arr2.add();
	Collections.sort(arr1);
		arr2.add(arr1);
		System.out.println(arr2.lastIndexOf(arr1));
		System.out.println(arr2.indexOf(arr));
		arr1.remove(0);
		//arr.add(arr2);
		
	System.out.println(arr2);
	
System.out.println(arr.hashCode()==(arr1.hashCode()));
	}

}
