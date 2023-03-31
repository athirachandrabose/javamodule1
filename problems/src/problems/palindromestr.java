package problems;
import java.util.*;
public class palindromestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.next();
 str=str.toLowerCase();
 int n=str.length();
 boolean flag=true;
for(int i=0;i<n;i++) {
	if(str.charAt(i)!=str.charAt(n-i-1)) {
		flag=false;
		break;
	}
}if(flag)
	System.out.println("yes palindrome");
else
	System.out.println("no");
	}

}
