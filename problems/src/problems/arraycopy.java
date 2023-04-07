package problems;

import java.util.Arrays;
import java.util.Scanner;

public class arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr1= {1,2,3,4,5};
		
       int[] arr2= new int[arr1.length];
       System.out.println(Arrays.toString(arr1));
       for(int i=0;i<arr1.length;i++) {
    	   arr2[i]=arr1[i];
       }
       System.out.println("elements of first array");
       for(int i=0;i<arr1.length;i++) {
    	   System.out.println(arr1[i]+" ");
       }
       System.out.println("elements of second array");
       for(int i=0;i<arr2.length;i++) {
    	   //System.out.println(arr2[i]+" ");
       }
       System.out.println(Arrays.toString(arr2));
	}

}
