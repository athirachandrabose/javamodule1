package firsttest;

public class Calculator {
	public int power(int b, int e) {
		int p = 1;
		int i = 1;
		if (b == 0 || e == 0) 
			return 1;
		 else {
			while (i <= e) {
				p *= b;
			}
		}
		return p;
	}
	public int  factorial(int n) {
		int fact=n;
		for(int i=(n-1);i>1;i--) 
			fact=fact*i;
		return fact;
	}
	
	public int add(int a,int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	
	
	
	
	

}
