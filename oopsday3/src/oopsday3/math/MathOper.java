package oopsday3.math;

public class MathOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MathImp r=new MathImp();
    System.out.println("addition is"+ r.add(8, 2));
    System.out.println("subtraction is"+r.sub(10, 5));
    System.out.println("product is"+r.mul(10, 2));
    System.out.println("division is"+r.div(20, 5));
    System.out.println("remainder is"+r.rem(10,3));
    r.fact(5);
    r.prime(3);
    r.oddEven(8);
    r.negPos(-9);
    r.rev(85);
	}

}
