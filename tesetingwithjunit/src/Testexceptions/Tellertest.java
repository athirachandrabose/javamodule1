package Testexceptions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tellertest {

	Teller teller=new Teller();

	@Test(expected=InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount() {
	Teller.validateTransaction("EUR", -100);
		//fail("Not yet implemented");
	}
	@Test(expected=IllegalArgumentException.class)
    public void testValidateUnAcceptedCurrency() {
		Teller.validateTransaction("AUSD", 100);
	}
}
