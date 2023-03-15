package testlambda;

public class LambdaSwitchcase {
	static double calculator(String operator, double x, double y) {
		return switch (operator) {
		case "+" -> x + y;
		case "-" -> x - y;
		case "*" -> x * y;
		case "/" -> {
			if (y == 0) {
				throw new IllegalArgumentException("can't be divided");
			}
			yield x / y;
		}
		default -> throw new IllegalArgumentException("unexpected value" + operator);
		};
	}

	public static void main(String[] args) {
		LambdaSwitchcase oper = new LambdaSwitchcase();
		System.out.println(oper.calculator("+",8,9));
		System.out.println(oper.calculator("*",8,9));
		System.out.println(oper.calculator("-",18,9));
		System.out.println(oper.calculator("/",18,9));
		System.out.println(oper.calculator("/",8,0));
	}
}
