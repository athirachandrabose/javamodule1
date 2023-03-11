package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Math obj= new Math();
int result= obj.add(10,10);
System.out.println(result);
result=obj.add(10, 20, 30);
System.out.println(result);
double results=obj.add(10, 20);
System.out.println(results);
results=obj.add(10, 20, 20);
System.out.println(results);
results=obj.add(10l, 20l, 30l);//no error long can be accomodated in double because double is wider
System.out.println("long  "+results);
results=obj.add(10.5f,20.6f );
System.out.println("float "+results);
results=obj.add(5, 5.5);
System.out.println(results);
	}

}
