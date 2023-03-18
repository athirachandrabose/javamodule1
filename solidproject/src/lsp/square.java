package lsp;

public class square implements ShapeIface {
private int side;

public square(int side) {
	//super();
	this.side = side;
}

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}
public int getArea() {
	return this.side*this.side;
}
}
