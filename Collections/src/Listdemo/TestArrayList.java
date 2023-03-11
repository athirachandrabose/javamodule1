package Listdemo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList flowers=new ArrayList();
     flowers.add("tulips");
     flowers.add("jasmine");
     flowers.add("Rose");
     flowers.add("lilly");
     flowers.add("sunflower");
     flowers.add(new java.util.Date());
     flowers.add(new Integer(5));
     flowers.add(new Double(17.5));
     flowers.add(new java.util.Scanner(System.in));
		
		  System.out.println(flowers);//[tulips,jasmine,Rose,lilly,sunflower]
		  System.out.println(flowers.size());//5
		  System.out.println(flowers.get(1));//jasmine
		  System.out.println(flowers.contains("liLLY"));//false
		  System.out.println(flowers.remove(4));//sunflower
		  System.out.println(flowers);//[tulips,jasmine,Rose,lilly]
		      for(Object obj:flowers) {
    	 System.out.println(obj);//tulips jasmine, rose ,lilly
     }
     Iterator  iter=flowers.iterator();
     while(iter.hasNext()) {
    	 System.out.println(iter.next());
     }
     for(int i=0;i<flowers.size();i++) {
    	 System.out.println(flowers.get(i));
     }
     String str=(String) flowers.get(2);
     System.out.println(str);//lilly
	
	Object obj=flowers.get(1);
	if(obj instanceof Integer) {
		Integer in= (Integer)obj;
		System.out.println(in.MAX_VALUE);
	}
	else if(obj instanceof String) {
		String st=(String)obj;
		System.out.println(st.toUpperCase());
	}
	else if(obj instanceof Double) {
		Double d=(Double)obj;
		System.out.println(d.MIN_VALUE);
	}
	}
}
