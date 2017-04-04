package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetdemo {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("hello");
		h.add("how are u");
		h.add("jay");
		h.add(12);
		h.add(12);
		h.add(null);
		
		
		System.out.println(h);
	Iterator a=h.iterator();
	System.out.println(a.hasNext());
	System.out.println(a.next());
		
		for( Object i:h){
		System.out.println(i);
}
		

	}

}
