package testlambda;
@FunctionalInterface
public interface TestInterface {

	public double method();
	public default void method2() {
	// n number of default methods	in interface
		System.out.println("from method 2");
	}
	public static void method3() {
		System.out.println("from method 3");
	}
	
}
