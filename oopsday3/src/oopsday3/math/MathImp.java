package oopsday3.math;

public class MathImp implements MathIface {
    private int a;
    private int b;
    private int n;
    public MathImp() {
		// TODO Auto-generated constructor stub
	}
	public MathImp(int a, int b, int n) {
		super();
		this.a = a;
		this.b = b;
		this.n = n;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double rem(double a, double b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	@Override
	public int fact(int n) {
		// TODO Auto-generated method stub
		int fact=n;
		for(int i=(n-1);i>0;i--) {
			fact=fact*i;
		}
		return fact;
	}

	@Override
	public void prime(int n) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("prime");}
		else
				System.out.println("not prime");
		
		
	}

	@Override
	public void oddEven(int n) {
		// TODO Auto-generated method stub
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
	}

	@Override
	public int negPos(int n) {
		// TODO Auto-generated method stub
		if(n>0)
			System.out.println("positive");
		else
			System.out.println("negative");
		return 0;
		
	}

	@Override
	public int rev(int n) {
		// TODO Auto-generated method stub
		int rem;
		int reverse=0;
		while(n>0) {
			rem=n%10;
			reverse=(reverse*10)+rem;
		    n=n/10;
		}
		return reverse;
	}

}
