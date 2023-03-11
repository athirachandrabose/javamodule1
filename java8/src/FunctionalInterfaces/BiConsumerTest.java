package FunctionalInterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String,String> map= new HashMap();{
    	map.put("ola", "o") ;
    	map.put("hello", "h");
    	map.put("chan", "c");
    	map.forEach((k,v)->{
    		System.out.println(k+"and"+v);});
     
     BiConsumer<String,String> bi=(k,v)->{
    	 System.out.println(k+"and"+v);
    	 
     };
     map.forEach(bi);
     }
	}
	}


