package problems;
import java.util.*;
public class SecGreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> ar= new ArrayList<Integer>();
  ar.add(120);
  ar.add(25);
  ar.add(340);
  ar.add(50);
  ar.add(500);
  System.out.println(ar);
  int max=0;
  for(int i=0;i<ar.size();i++) {
	  if(ar.get(i)>max) {
		  max=ar.get(i);
	  }
	  else continue;
  }
  System.out.println("max:"+" "+max);
  Collections.sort(ar);
  System.out.println("sorted array :"+" "+ar);
  int a=ar.size();
  System.out.println("size:"+" "+a);
  System.out.println("second largest num in arraylist:"+" "+ar.get(a-2));
  
  
	}

}
