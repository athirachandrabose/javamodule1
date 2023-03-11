package Listdemo;

import java.util.TreeSet;
import java.util.Iterator;
public class TestTreeSet {
//
public static void main(String[] args) {
//		// TODO Auto-generated method stub
	TreeSet<String> bookset = new TreeSet<>();
	bookset.add("java in nutshelll");
	bookset.add("java is simple");
		bookset.add("java is powerful");
		bookset.add("what is java");
		bookset.add("java is simple");
 //          bookset.add(null);//treeset doesnot allow null elements
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
