package problems;
import java.util.*;
public class LowToUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.next();
String s="";

for(int i=0;i<str.length();i++) {
	if(Character.isLowerCase(str.charAt(i))) {
	s+=Character.toUpperCase(str.charAt(i));
	
	}
	else if(Character.isUpperCase(str.charAt(i))) {
		s+=Character.toLowerCase(str.charAt(i));
		
	}
}
System.out.println(s);
//String str="hloo guyzz";
//str=str.replaceAll(" ", "a");
//System.out.println(str);
//	
}
	
}
