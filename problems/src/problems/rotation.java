package problems;
import java.util.*;
public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
       
        String str3=str1.concat(str1);
        if(str3.contains(str2)) {
        	System.out.println("yes");
        }
        else {
        		System.out.println("no");
        }
//        String str3="";
//        for(int i=str1.length()-1; i>=0;i--) {
//        
//        
//       str3=str3+str1.charAt(i);        }
//        System.out.println(str3);
	}

}
