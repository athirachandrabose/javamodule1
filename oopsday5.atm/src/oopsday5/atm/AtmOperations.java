package oopsday5.atm;

import java.util.Scanner;

public class AtmOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmImpl ao = new AtmImpl();
		AtmFunctions af=new AtmFunctions();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount:");
		af.setAmount(sc.nextInt());
		ao.withdraw();
		af.check();
		
	}

}
