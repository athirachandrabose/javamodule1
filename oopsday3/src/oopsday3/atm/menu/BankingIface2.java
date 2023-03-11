package oopsday3.atm.menu;
import oopsday2.atm.exception.InsufficientFundsException;
public interface BankingIface2 {
	public   double withdraw(double amount,int actno) throws InsufficientFundsException, oopsday3.atm.menu.InsufficientFundsException;
	public   double deposit(double amount,int actno); //throws;
	public   double balanceEnquiry(int actno);

}
