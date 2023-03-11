package exceptionhandlingday6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program task begins");
		try {

			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();

			int c = a / b;
			System.out.println(c);
	} catch (ArithmeticException e) {
			System.out.println("cannot divided by 0");
		}

		catch (InputMismatchException e) {
			System.out.println("invalid input");
		}

		System.out.println("program task completed");
	}
}
