package Collections;

import java.util.List;
import java.util.ListIterator;

public class IteratorInterface extends CollectionFramework {
	 
	 public void usingListIterator(List<Object> list) {
		 
		ListIterator lst=list.listIterator(list.size());
		
		while(lst.hasPrevious())
		{
			String str=(String)lst.previous();
			System.out.println(str);
		}
		 
	 }
	 
	 public void usingForLoop(List<Object> list) {
		 
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
	 }
	 
	 public void usingForEachMethod(List<Object> list) {
		 
		 list.forEach(a->{
			 System.out.println(a);
		 });
	 }
	 
	 public void usingForEachRemaining(List list) {
		 
		 java.util.Iterator<String> itr=list.iterator();
		 itr.forEachRemaining(a->{
			 System.out.println(a);
		 });
	 }
	 
}