package FunctionalInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> string=Arrays.asList("Tamilnadu","Telengana","kerala","Andhra pradesh","karnataka");
		
		
		
       Function<String,Integer> f= (str)->{
    	   return str.length();
       };
       for(String str:string) {
    	   System.out.println(f.apply(str));
       }
       
 
       System.out.println(f.apply("HLOO guyzzz"));
       
       Function<Integer,Integer> f2=(n)->{
    	   return n*n;
       };
       System.out.println(f2.apply(25));
       
       Function<String,String> f3=(str)->{
    	   return str.toUpperCase();
       };
       System.out.println(f3.apply("ust global"));
	}

}
