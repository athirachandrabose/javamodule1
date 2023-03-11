package FunctionalInterfaces;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Tamilnadu", "Telengana", "kerala", "Andhra pradesh", "karnataka");
         Consumer<String> consumer=(str)->{
        	 System.out.println(str);
         };
         consumer.accept("iam doing great");
         for(String str:strings) {
        	 consumer.accept(str);
         }
         printstrings(strings,consumer);
	}
	public static void printstrings(List<String> strings,Consumer<String> pre) {
		for( String stri:strings) {
			pre.accept(stri);
		}
	}
}
