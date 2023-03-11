package FunctionalInterfaces;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Tamilnadu", "Telengana", "kerala", "Andhra pradesh", "karnataka");
	    Predicate<String> p=(String str)->{
	    	return str.length()>10;
	    };
	    System.out.println(p.test("helloworlds"));
		/*
		 * for( String str:strings) { System.out.println(p.test(str)); }
		 */
	    decidelength(strings,p);
	 
	}
public static void  decidelength(List<String> strings,Predicate<String> re) {
	for( String str:strings) {
		System.out.println(re.test(str));
	}
}
}
