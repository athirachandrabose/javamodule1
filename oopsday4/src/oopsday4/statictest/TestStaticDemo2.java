package oopsday4.statictest;

public class TestStaticDemo2 {
public static void main(String[] args) {
	StaticDemo2 d1=new StaticDemo2();
		
	d1.method();//method is instance method to access instance method object is mandatory
	StaticDemo2.method();//when method is static we can access it with class name

	
}
}
