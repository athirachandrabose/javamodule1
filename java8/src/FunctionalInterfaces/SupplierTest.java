package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("Tamilnadu", "Telengana", "kerala", "Andhra pradesh", "karnataka");

		Supplier<String> supplier = () -> {
			return new String("hola");
		};
		System.out.println(supplier.get());
		
	}
}

