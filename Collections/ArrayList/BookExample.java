package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class BookExample {

	public BookExample() {
		// TODO Auto-generated constructor stub
		List<Book> lst=new ArrayList<>();
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4); 
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
		
		lst.add(b1);
		lst.add(b2);
		lst.add(b3);
		
		for(Book b:lst)
			System.out.println(b.id+"-"+b.name+"-"+b.author+"-"+b.publisher+"-"+b.quantity);
	}
	
}

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.author=author;
		this.id=id;
		this.name=name;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
}
