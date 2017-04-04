package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapdemo {

	public static void main(String[] args) {
		LinkedHashMap m=new LinkedHashMap();
		m.put(21, "mathamatics");
		m.put(35, "science");
		m.put(40, "history");
		m.put(45, "computers");
		m.put(35, "science");
		System.out.println(m);
		System.out.println(m.get(21));
		System.out.println(m.values());
	Set x = m.keySet();
	 for(Object c:x){
		 System.out.println(c+" : "+m.get(c));
	 }
          Set y = m.keySet();
         Iterator a=y.iterator();
         
         
         
         
         while(a.hasNext()){
        	 Map.Entry e=(Map.Entry)a.next();
        	 System.out.println(e.getKey()+":"+e.getValue());
        	 a.hasNext();
         }
         
	}

}
