package problems;

import java.util.*;

public class RemoveAllEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(23);
		ar.add(100);
		ar.add(103);
		ar.add(130);
		System.out.println("arraylist:" + " " + ar);
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) % 2 == 0) {
				ar.remove(i);
			}

			System.out.println(ar);

		}

	}

}