package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(0, "hema");
	a.add("java class");
	a.add(34);
	a.add(34);
	a.add(2, "from index");
	
	System.out.println(a.remove(0));
	System.out.println(a.remove(3));
	System.out.println(a.get(2));
	System.out.println(a);
	
	Iterator s=a.iterator();
	
	System.out.println(s.hasNext());
	System.out.println(s.next());
	
	
	for(Object i:a){
		System.out.println(i);
		}
	ArrayList b=new ArrayList();
	b.addAll(a);
	b.add("from arraylist");
	b.add(36);
	System.out.println(b);
	
	for (Object k:b){
		System.out.println(k);
	}
	
	
	}

}
