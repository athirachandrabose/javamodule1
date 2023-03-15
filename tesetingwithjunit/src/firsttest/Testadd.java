package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testadd {
	static Calculator calc ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new Calculator();
		System.out.println("before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after  test executing each test cases");
	
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@Test
	public void testAdd() {
		int a=5;
		int b=6;
		int expectedvalue=11;
		int actualvalue=calc.add(a,b);
		assertEquals(expectedvalue,actualvalue);
		//fail("Not yet implemented");
	}

}
