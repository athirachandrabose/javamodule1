package oopsday3.atm.menu;

public class Account {
 private int actno;
 private String name;
 private String actTYPE;
 private double balance;
 

public Account(int actno, String name, String actTYPE, double balance) {
//	super();
	this.actno = actno;
	this.name = name;
	this.actTYPE = actTYPE;
	this.balance = balance;
}

public int getActno() {
	return actno;
}

public void setActno(int actno) {
	this.actno = actno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getActTYPE() {
	return actTYPE;
}

public void setActTYPE(String actTYPE) {
	this.actTYPE = actTYPE;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

}
 
