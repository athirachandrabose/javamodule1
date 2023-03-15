package firsttest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Testadd.class, Testcalculator.class, Testfactorial.class })
public class AllTests {

}
