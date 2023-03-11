package Listdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String,String> countrycurr=new HashMap<>();
     countrycurr.put("India", "Rupee");
     countrycurr.put("USA", "dollar");
     countrycurr.put("UK", "pound");
     countrycurr.put(null, null);
    // countrycurr.put(null, null);
     System.out.println(countrycurr);
     System.out.println(countrycurr.get("India"));
     System.out.println(countrycurr.size());
     System.out.println(countrycurr.containsKey("USA"));
     System.out.println(countrycurr.containsValue("dollar"));
     //hashmap has 3 views
     //key view
     Set<String> keys=countrycurr.keySet();
     for(String key:keys) {
    	 System.out.println(key);   	 
     }
     Collection<String> value=countrycurr.values();
     for(String values:value) {
     System.out.println(values);
     }
	Set<Entry<String,String>> entry=countrycurr.entrySet();
	for(Entry<String,String>entries:entry){
	System.out.println(entries);
	}
	}
}
