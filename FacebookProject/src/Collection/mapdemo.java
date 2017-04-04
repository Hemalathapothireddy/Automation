package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class mapdemo {

	public static void main(String[] args) {
	
		HashMap m=new HashMap();
		m.put("jay", 21);
		m.put("hema", 22);
		m.put("shruti", 23);
		m.put("prayaag", 24);
	
		m.replace("shruti", 22);
		Set x=m.entrySet();
		for (Object j:x){
			System.out.println(j);
		}
	Set s=m.keySet();
		// for (Object i:s){
			// System.out.println(i+":"+m.get(i));
		// }
		 
		Set s1=m.entrySet();
		  Iterator  s2=s1.iterator();
		  
		  while(s2.hasNext()){
			  
			  Map.Entry e=(Map.Entry)s2.next();
			  System.out.println(e.getKey()+" : "+e.getKey());
			  s2.hasNext();
		 

	  
	  
		}
		 

		/*System.out.println(m);
		System.out.println(m.get("hema"));
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
		System.out.println(m.values());*/
			
		
		
	}
		
		
	

	
		
	

}
