package testlambda;
@FunctionalInterface
interface shape {//functional interface can have only one method
	double area();
	//double perimeter();
}
interface math{
	double power(int a,int b);
}
interface facto{
	int fact(int x);
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1= new Runnable(){
			public void run() {
				System.out.println("from run method");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		Runnable r=()->{
			for(int i=1;i<5;i++) {
				System.out.println("in the run method"+i);
			}
		};
		Thread t= new Thread(r1);
		t.start();
		math m = (int b,int e) ->{int p=1;
		               for(int i=1;i<=e;i++) {
		            	   p*=b;
		               }
			return p;
		};
		double p=m.power(2, 3);
		System.out.println(p);
		
		shape s = () -> {
			return 0;
		};
		double result = s.area();
		System.out.println(result);
		
		facto factorial=(int n)->{int f=1;
		               for(int i=1;i<=n;i++) {
		            	   f=f*i;
		               }return f;
		};
			      
		int res=factorial.fact(5);
		System.out.println(res);
		
		
	}

}
