package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface extends CollectionFramework{
	
	/**
	 * {@summary
	 * Queue interface maintains the first-in-first-out order }
	 * ordered list 
	 * 
	 * @uses
	 * Queue<String> q1 = new PriorityQueue(); 
	 * Queue<String> q2 = new ArrayDeque();
	 * 
	 * @class PriorityQueue, Deque, and ArrayDeque 
	 */
	public void queueIterator(Queue<String> qu) {
		Iterator itr= qu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void printElements(Queue<String> qu) {
		for(String str:qu)
			System.out.println(str);
	}

}

class Priority_Queue extends QueueInterface{
	
	public Priority_Queue() {
		// TODO Auto-generated constructor stub
	PriorityQueue<String> pq=new PriorityQueue<>();
	
	pq.add("Amit Sharma");
	pq.add("Vijay Raj");
	pq.add("Jai Shankar");
	pq.add("Raj");
	
	System.out.println("head (first element) :"+pq.element());// throws exception when the q is empty
	System.out.println("head :"+pq.peek());
	
	queueIterator(pq);
	
	System.out.println("Removes the head of the q :"+pq.remove());
	System.out.println("Remove :"+pq.poll());
	
	
	
	}
}

class Deque_Queue extends QueueInterface{
	/*
	 * In Deque, we can remove and add the elements from both the side double-ended
	 * queue , perform the operations at both the ends.
	 * Deque d = new ArrayDeque();  
	 */
	public Deque_Queue() {
		// TODO Auto-generated constructor stub
		
		Deque<String> dq=new ArrayDeque<>();
		dq.add("Gautam");
		dq.add("karan");
		dq.add("Ajay");
		dq.addFirst("ro");
		dq.addLast("nan");
		
		printElements(dq);

	}
	
}


