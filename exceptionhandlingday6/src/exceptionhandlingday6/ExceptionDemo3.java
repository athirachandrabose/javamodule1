package exceptionhandlingday6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program task begins");
		try {
			System.out.println("enter try");
			int c=10/0;
			System.out.println("from after exception");

		} 
		catch (ArithmeticException e) {
			e.printStackTrace();}
		
			catch (Exception e) {
	
			System.out.println("from catch----");
		} 
			finally {
		
			System.out.println("from finally-----");
		}
		System.out.println("program task completed");
	}

}
