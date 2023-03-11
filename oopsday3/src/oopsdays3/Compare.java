package oopsdays3;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1= new Rectangle();
Rectangle r2= new Rectangle();

Triangle t1= new Triangle();
Triangle t2= new Triangle();
//comparing primitives
int a=10;
int b=35;
boolean result= a==b;//are they same or equal
//comparing objects
//case1: comparing references,case2: comparing members
result=r1==r2;
System.out.println(result);//false
result =t1==t2;
System.out.println(result);//false
//result=r1==t1;
//System.out.println(result);//incompatible type
Rectangle r3=r1;
result=r3==r1;//r3 is reference to r1
System.out.println(result);//true
System.out.println(r1.hashCode());//1211888640
System.out.println(r3.hashCode());//1211888640
System.out.println(r2.hashCode());//564160838
result=r1.equals(r2);
System.out.println(result);//false
result=r1.equals(r3);
System.out.println(result);//true equals  not applicable for primitives
r1.setLength(35.5);
r1.setBreadth(75.45);

r2.setLength(35.5);
r2.setBreadth(75.45);
if(r1.getLength()==r2.getLength()&&r2.getBreadth()==r1.getBreadth())
	System.out.println("they have same length and breadth");
else
	System.out.println("they are different");
t1.setS1(35.5);
t1.setS2(45.75);
t1.setS3(65.5);
if(r1.getLength()==t1.getS1())//we are not comparing objects r1 and t1 we are comparing data members of r1 and t1
	System.out.println("length and side are same");
else
	System.out.println("not same");
	}

}
