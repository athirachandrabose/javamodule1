package Listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> queue = new ArrayDeque();
		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("four");
		queue.addLast("fifth");
		System.out.println(queue);
		System.out.println(queue.size());
		String element = queue.getFirst();
		System.out.println(element);
		queue.pollFirst();
		System.out.println(queue);
		 String elements=queue.peek();
		System.out.println(elements);
		queue.poll();
		System.out.println(queue);
	    Iterator<String> iter=queue.iterator();
	    while(iter.hasNext()) {
	    	System.out.println(iter.next());
	    }
	   Iterator<String> iters=queue.descendingIterator();
	   while(iters.hasNext()) {
		   System.out.println(iters.next());
	   }
	}

}
