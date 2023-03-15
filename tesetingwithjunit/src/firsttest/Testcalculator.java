package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testcalculator extends Calculator {
	Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@Test
	public void testpowerzero() {
		//int inputbase = 0;
		//int exponent = 0;
		int expectedvalue = 1;
		int actualvalue = calc.power(0, 0);
		assertTrue(expectedvalue==actualvalue);
	}

	/*
	 * @Test public void testPower() { int inputbase = 2; int exponent = 3; int
	 * expectedvalue = 8; int actualvalue = calc.power(inputbase, exponent);
	 * assertEquals(expectedvalue, actualvalue); // fail("Not yet implemented"); }
	 */
	/*
	 * @Test public void testFactorial() { int nv = 5; int expectedvalue = 120; int
	 * actualvalue = calc.factorial(nv); assertEquals(expectedvalue, actualvalue); }
	 * 
	 * @Test public void testAdd() { int a = 5; int b = 6; int expectedvalue = 11;
	 * int actualvalue = calc.add(a, b); assertEquals(expectedvalue, actualvalue);
	 * // fail("Not yet implemented"); }
	 */
}
