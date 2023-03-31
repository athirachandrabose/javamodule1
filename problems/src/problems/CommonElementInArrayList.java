package problems;

import java.util.ArrayList;

public class CommonElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("apple");
		ar.add("orange");
		ar.add("grapes");
		ar.add("lemon");
		ar.add("peach");
        System.out.println("first array :"+" "+ar);
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("apple");
		ar1.add("orange");
		ar1.add("tomato");
		ar1.add("lemon");
		ar1.add("guava");
	    System.out.println("second array :"+" "+ar1);
	    ar.retainAll(ar1);
	    System.out.println(ar);
	}

}
