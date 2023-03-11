package oopsday4.polymorphism;

public class Square extends Shape {
public double side;

public Square(double side) {
	super();
	this.side = side;
}

public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}
public double area() {
	return this.side*this.side;
}
}
