package problems;
import java.util.*;

public class whitespace {
//static int find(String s) {
//	 int temp=0;
//     for(int i=0;i<s.length();i++) 
//     {
//      for(int j=i+1;j<s.length();j++) 
//      {
//     if(s.charAt(i)==s.charAt(j)) 
//     {
//    	 temp=i;
//    	 break;
//     }
//     }
//      if(temp!=0) 
//    	  
//    	  break;
//     }
//      return temp;
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//        int p=find(s);
//        if(p==0)
//          System.out.println("not found");
//        else
//        	System.out.println(s.charAt(p));
//	
//
//}
//}
	public static void main(String[] args) {
		 
      String s="hloo guyzz";
      s=s.replaceAll(" ", "");
      System.out.println(s);
	}
}