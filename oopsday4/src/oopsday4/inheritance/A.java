package oopsday4.inheritance;

public class A {
     private int x;
     private int y;
     public A() {
		// TODO Auto-generated constructor stub
    	
	}
	public A(int x, int y) {
		super();//constructor chaining
		this.x = x;
		this.y = y;
		 System.out.println("from A()");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
     
    
}
