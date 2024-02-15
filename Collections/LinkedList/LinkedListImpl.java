package Collections.LinkedList;

public class LinkedListImpl {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.addAtEnd(1);
		ll.addAtEnd(2);
		ll.addAtEnd(3);
		//ll.print();
//		ll.addAtStart(5);
//		ll.addAtStart(4);
		ll.print();
	}
}
	
	class Node{
		int val;
		Node next;
		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
			next=null;
		}
	}
	
	class LinkedList{
		private Node head;
		private Node tail;
		public LinkedList() {
			// TODO Auto-generated constructor stub
			head=null;
			tail=head;
		}
		
		void print() {
			Node curr=head;
			while(curr!=null) {
				System.out.println(curr.val);
				curr=curr.next;
			} 
			
		}
		void addAtEnd(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
				tail=head;
	}else 
	{
				
				
				Node curr=head;
				tail.next=temp;
               // tail=temp;
//				while(curr.next!=null) {
//					curr=curr.next;
//				} curr.next=temp;
				
				 
			} }
		
		
		void addAtStart(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
			}else {
				temp.next=head;
				head=temp;  
			}
		}
	}

