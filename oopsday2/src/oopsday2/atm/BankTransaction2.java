package oopsday2.atm;

public class BankTransaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Account a1=new Account(101,"JAMES DAVE","savings",500);
	   Account a2=new Account(102,"JAME DAVES","salary",750);
	   Account a3=new Account(103,"JANET DAVE","savings",5000);
	   Account a4=new Account(104,"JAS DAVE","salary",550);
	   Account a5=new Account(105,"JAME DAVE","pension",600);
	   BankofAmerica2 boa=new BankofAmerica2();
	   boa.addAccount(a1);
	   boa.addAccount(a2);
	   boa.addAccount(a3);
	   boa.addAccount(a4);
	   boa.addAccount(a5);
	   System.out.println(boa.balanceEnquiry(101));
	   
	   double result=boa.deposit(300,102);
	   System.out.println(result);
	    double results=boa.withdraw(400,105);
	   System.out.println(results);
	    						
	}

}
