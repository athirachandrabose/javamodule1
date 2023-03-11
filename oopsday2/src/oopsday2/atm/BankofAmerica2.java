package oopsday2.atm;



public class BankofAmerica2 implements BankingIface2 {
	private Account[] accounts = new Account[5];
	private int accountindex = 0;

	public BankofAmerica2() {
		// TODO Auto-generated constructor stub
	}

	public BankofAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	public Account[] getAccount() {
		return accounts;
	}

	public void setAccount(Account[] accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (this.accountindex < accounts.length)
			accounts[this.accountindex++] = account;
		else
			System.out.println("operation not allowed");
	}

	public Account transaction(Account account) {
		return account;
	}

	@Override
	public double withdraw(double amount, int actno)  {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}

		}
		return tempBal;
	}

	@Override
	public double deposit(double amount, int actno) {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				break;
			}
		}
		return tempBal;
	}

}
