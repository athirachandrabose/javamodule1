package Listdemo;

import java.util.HashSet;
import java.util.Iterator;
public class TestHashSet {
//
public static void main(String[] args) {
//		// TODO Auto-generated method stub
	HashSet<String> bookset = new HashSet<>();
	bookset.add("java in nutshelll");
	bookset.add("java is simple");
		bookset.add("java is powerful");
		bookset.add("what is java");
		bookset.add("java is simple");
//
		System.out.println(bookset);
		System.out.println(bookset.size());
		System.out.println(bookset.contains("java is powerful"));

		for (String book : bookset) {
			System.out.println(book);
		}
		Iterator <String> itr=bookset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
	}

}
