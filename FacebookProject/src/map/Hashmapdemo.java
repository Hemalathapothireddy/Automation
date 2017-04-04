
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapdemo {

	private static final boolean Object = false;

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(11, "jay");
		hm.put(12, "hema");
		hm.put(13, "shruti");
		hm.put(14, "prayaag");
	
		System.out.println(hm);
		System.out.println(hm.get(13));
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
		Set a = hm.keySet();
		 for(Object i:a){
			 System.out.println(i+" : "+ hm.get(i));
			 
		 }

		Set b = hm.entrySet();
		    Iterator c = b.iterator();
		    
			
			while(c.hasNext()){
				Map.Entry d=(Map.Entry)c.next();
				System.out.println(d.getKey()+":"+d.getValue());
				c.hasNext();
				
		    	
		    }
		
		 
	}

}
