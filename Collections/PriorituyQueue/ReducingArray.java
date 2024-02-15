package Collections.PriorituyQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ReducingArray {
	static PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
	static int[] a= {1,2,11,13,7,2,1,3,5};
	
	public static void main(String[] args) {
		
		 //2 1 11 13 7 
		   
			addElements(a);
			//sortArray(a);
			
           reduceArray();
           
           System.out.println(a);
           System.out.println(pq);
        
        }
	
	static void addElements(int[] a) {
		for(int i:a) {
        	//System.out.println(i);
        	 pq.add(i);
        }
	}
	static void reduceArray() {
	while(pq.size()>=2) {
    	int op1=pq.poll();
    	int op2=pq.poll();
    	
    	int value=findDifference(op1,op2);
    	//System.out.println(value);
    	pq.add(value);
	}
	}
	
static int findDifference(int op1,int op2) {
		return op1-op2;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

		

	static void sortArray(Integer[] a) {
		
		//Arrays.sort(a,Collections.reverseOrder());
				Arrays.sort(a,Collections.reverseOrder());
		
	}
	
	static void reduceArray1(Integer[] a) {
		for(int i=0;i<a.length;i++) {
			
			int value=findDifference(a[0], a[1]);
			sortArray(a);
		}
		
	}



















}
