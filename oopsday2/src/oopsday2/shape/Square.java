package oopsday2.shape;

public class Square implements Area {
 private double l;
	@Override
	public void area() {
System.out.println(l*l);
		// TODO Auto-generated method stub

	}
	public Square(double l) {
		super();
		this.l = l;
	}
	@Override
	public String toString() {
		return "Square [l=" + l + "]";
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}

}
