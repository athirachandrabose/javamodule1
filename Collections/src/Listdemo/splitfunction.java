package Listdemo;
import java.util.*;
public class splitfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number:");
     int num=sc.nextInt();
     System.out.println("enter the number of person you want to split:");
     int nop=sc.nextInt();
     int sum=0,examt=0;
     for(int i=1;i<=nop;i++) {
    	 System.out.println("personamt"+i);
    	 int pamt=sc.nextInt();
    	 sum=sum+pamt;
     }
     if(sum==num) {
    	 System.out.println("amount splitted sucessfully");
     }
     else if(sum>num) {
    	 examt=sum-num;
    	 System.out.println("amount needed more"+examt);
     }
     else if(sum<num) {
    	 examt=sum-num;
    	 System.out.println("amount left"+examt);
     }
	}

}
