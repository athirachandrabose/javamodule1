package oopsday3.atm.menu;
import java.util.*;
import oopsday2.atm.exception.*;
public class BankMenu {

	BankofAmerica2 boa=new BankofAmerica2();
	
	
	      public BankMenu() 
	      {
		  Account a1=new Account(101,"JAMES DAVE","savings",500);
		   Account a2=new Account(102,"JAME DAVES","salary",750);
		   Account a3=new Account(103,"JANET DAVE","savings",5000);
		   Account a4=new Account(104,"JAS DAVE","salary",550);
		   Account a5=new Account(105,"JAME DAVE","pension",600);
		   boa.addAccount(a1);
		   boa.addAccount(a2);
		   boa.addAccount(a3);
		   boa.addAccount(a4);
		   boa.addAccount(a5);
	       }   
	
	public void menu(){
    int ch=0;
    Scanner sc=new Scanner(System.in);
   
	
	loop:do {
		System.out.println("1:display account");
		System.out.println("2:deposit amount");
		System.out.println("3:withdraw amount");
		System.out.println("4:display balance");
		System.out.println("5:exit menu");
		System.out.println("enter your choice");
		ch=sc.nextInt();
	     switch(ch) {
	     case 1:{
	    	 System.out.println("enter actno");
	    	 int actno=sc.nextInt();
	    	 boa.displayAccount(actno);
	    	 break;}
	     case 2:{
	    	 System.out.println("enter actno");
	    	 int actno=sc.nextInt();
	    	 System.out.println("enter the amount to deposit");
	    	 int amount=sc.nextInt();
	    	 double balance=boa.deposit(200, 101);
	    	 System.out.println(balance);
	    	 break;}
	     case 3:
	    	 System.out.println("enter actno");
	    	 int actno=sc.nextInt();
	    	 System.out.println("enter the amount to withdraw");
	    	 int amount=sc.nextInt();
	    	 double balance;
			try {
				balance = boa.withdraw(200.75, actno);
			} catch (InsufficientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	// System.out.println(balance);
	    	 break;
	     case 4:
	    	
	    	 break;
	     
	     case 5:
	    	 
	     
	     }
	}while(ch!=5); 
	  
  
	}
	
	}
