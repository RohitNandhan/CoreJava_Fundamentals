package Collections.PriorituyQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CrudOperation {
	public static PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[] args)
	{
		
		int[] arr= {12,13,2,15,16,2};
		//Integer a=12;
		//System.out.println( Integer.bitCount(14));
		for(int i:arr) {
			if(i/10==1) {
				//System.out.println("1");
				addElement(i);
			}
			else if(i==2){
				int value=maxInt();
				System.out.println( value);
			}
		}
	}
	
	static void addElement(int element) {
		
		//System.out.println( element);
		q.add(element);
		
	}
	
	static int maxInt() {
		return q.poll();
	}

}
