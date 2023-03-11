package oopsday4.statictest;

public class TestStaticDemo {

	public static void main(String[] args) {
		// TOtDO Auto-generated method stub
 System.out.println(StaticDemo.a);//0
 StaticDemo d=new StaticDemo();
 System.out.println(d.a);//1
 StaticDemo d1=new StaticDemo();
 System.out.println(d1.a);//2
 StaticDemo d2=new StaticDemo();
 System.out.println(d2.a);//3
 System.out.println(StaticDemo.a);//3 static can be accessed with both class name wa well as object name.
// d.a=20;
// System.out.println(d1.a);//if variable is not  static it will print 0,if it is static it will print 20
// d1.a++;
// System.out.println(d.a);//21
	}

}
