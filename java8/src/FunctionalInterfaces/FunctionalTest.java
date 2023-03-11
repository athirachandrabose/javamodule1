package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Tamilnadu", "Telengana", "kerala", "Andhra pradesh", "karnataka");

		Function<String, Integer> f = (str) -> {
			return str.length();
		};
		printlength(strings, f);

		Function<String, String> f1 = (str) -> {
			return str.toUpperCase();
		};
		upper(strings, f1);

		Function<String, String> f2 = (str) -> {
			return str.toLowerCase();
		};
		lower(strings, f2);

		Function<String, String> f3 = (str) -> {
			StringBuilder sb = new StringBuilder(str);
			StringBuilder st = sb.reverse();
			return st.toString();

		};
		rev(strings, f3);
	}

	public static void printlength(List<String> strings, Function<String, Integer> fRef) {

		for (String str : strings) {
			System.out.println(fRef.apply(str));
		}
	}

	public static void upper(List<String> strings, Function<String, String> fRe) {
		for (String st : strings) {
			System.out.println(fRe.apply(st));
		}
	}

	public static void lower(List<String> strings, Function<String, String> fRefe) {
		for (String stri : strings) {
			System.out.println(fRefe.apply(stri));
		}
	}

	public static void rev(List<String> strings, Function<String, String> fRefer) {
		for (String strin : strings) {
			System.out.println(fRefer.apply(strin));
		}

	}
}
