package userdefinedobject;

import java.util.*;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hlooo hiii hlooo hiii my name is x your name is y";
				//"The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is desired.Bags or multisets (unordered collections that may contain duplicate elements) should implement this interface directly.All general-purpose Collection implementation classes (which typically implement Collection indirectly through one of its subinterfaces) should provide two \"standard\" constructors: a void (no arguments) constructor, which creates an empty collection, and a constructor with a single argument of type Collection, which creates a new collection with the same elements as its argument. In effect, the latter constructor allows the user to copy any collection, producing an equivalent collection of the desired implementation type. There is no way to enforce this convention (as interfaces cannot contain constructors) but all of the general-purpose Collection implementations in the Java platform libraries comply.The \"destructive\" methods contained in this interface, that is, the methods that modify the collection on which they operate, are specified to throw UnsupportedOperationException if this collection does not support the operation. If this is the case, these methods may, but are not required to, throw an UnsupportedOperationException if the invocation would have no effect on the collection. For example, invoking the addAll(Collection) method on an unmodifiable collection may, but is not required to, throw the exception if the collection to be added is empty.";
		String word[] = str.split(" ");
		System.out.println(word.length);
		HashMap<String, Integer> data = new HashMap<>();
		
		
		/*
		 * for(int i=0;i<word.length;i++) { for(int j=1;j<word.length;j++) {
		 * data.put(word[i], word[j]); if(word[i]==word[j]) { count++;
		 * System.out.println(word[i]+" "+count); } }
		 * 
		 * }
		 */
		for(int i=0;i<word.length;i++) {
			Integer integer=data.get(word[i]);
			if(integer!=null){
				int count=data.get(word[i]);
				data.put(word[i],++count);
			}
			else {
				data.put(word[i],1);
			}
		}
		System.out.println(data);
		int j= 111;
		String str1= j+" ";
		StringBuilder sb=new StringBuilder(str1);
		StringBuilder rev=sb.reverse();
		System.out.println(rev);
		boolean result=str1.equals(rev.toString());
		System.out.println(result);
		
		
		
		
		int n=10;
		String s="10";
		Integer integer=new Integer("10");
		String sint=s.valueOf(n);
		int m=Integer.parseInt(s);
	    //Integer to string
		String s2=integer.toString();
		System.out.println(s2);
		System.out.println(sint);
		System.out.println(m);
	}

}
