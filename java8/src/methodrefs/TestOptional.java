package methodrefs;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		String str2 = "hello";
		// Optional<String> optional=Optional.of(str);
		// System.out.println(optional.get());
		Optional<String> optional2 = Optional.ofNullable(str);
		if (optional2.isPresent())
			System.out.println("value is present" + " " + optional2.get());// if we pass str2  true condition is evaluated output will be value is
																			// present hello
		else
			System.out.println("is null"+"  "+
		optional2.orElse("str not initialized"));//str is passed else will exception and gives no such element exception will come
	}                             //by using orElse we can give  exception message
 
}
