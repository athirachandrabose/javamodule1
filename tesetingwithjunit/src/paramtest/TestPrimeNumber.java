package paramtest;

import java.util.Collection;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class TestPrimeNumber {
	private final Integer inputnumber;
	private final boolean expectedResult;
	private PrimeNumber primeNumber;

	@Before
	public void initialize() {
		primeNumber = new PrimeNumber();
	}

	public TestPrimeNumber(Integer inputnumber, boolean expectedResult) {
		super();
		this.inputnumber = inputnumber;
		this.expectedResult = expectedResult;
		
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(
				new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 22, false }, { 23, true }, { 24, false } });
	}

	@Test
	public void testValidator() {
		System.out.println("Paramterized number is" + inputnumber);
		assertEquals(expectedResult, primeNumber.validate(inputnumber));
	}

}
