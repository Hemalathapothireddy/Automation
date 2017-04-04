package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistdemotest1 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("from linkedlist");
		ll.add("from collection");
		ll.add(1, "java");
		ll.addFirst("jay");
		ll.addLast("hema");
		ll.set(0, "arraylist");
		System.out.println(ll.getLast());
		System.out.println(ll.get(1));
		System.out.println(ll.size());
		System.out.println(ll.removeLast());
	System.out.println(ll);
	
	 Iterator a=ll.iterator();
	 System.out.println(a.hasNext());
	System.out.println(a.next()); 
	
	
	for (Object b:ll){
		System.out.println(b);
	}
		
LinkedList l=new LinkedList();
 l.addAll(ll);
 l.add("from class");
 
 System.out.println(l);
 
	}

}
