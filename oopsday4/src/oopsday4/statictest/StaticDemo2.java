package oopsday4.statictest;

public class StaticDemo2 {
	 static int a;
static void  method() {
		System.out.println("from method"+a);//if a is not int it will give error  saying cant reference static to non static type
	}
	public void  method2() {
		
		System.out.println(a);//instance method can access static member
	 
	}

}
