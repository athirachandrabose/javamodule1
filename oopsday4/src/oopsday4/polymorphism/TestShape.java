package oopsday4.polymorphism;
class A{}
class B{}

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// B b=new B(); NARROWING NOT ALLOWED
		  A a=new  A();
      Shape s=new Rectangle(10.0,12.0);//
      if(s instanceof Rectangle) {
    	  Rectangle rect=(Rectangle)s;
      }
      double result=s.area();
      System.out.println(result);
    		  
      s=new Circle(2.0);
    		  result=s.area();
      System.out.println(result);
      s=new Square(6.0);
      result=s.area();
      System.out.println(result);
      Object obj=new String("hello");
      obj=new Integer("10");
      obj=new java.util.Scanner(System.in);
      obj=new Rectangle();
      if(obj instanceof String) {
    	  String str=(String)obj;
      }
	}

}
