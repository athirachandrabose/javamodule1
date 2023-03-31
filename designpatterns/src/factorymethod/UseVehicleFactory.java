package factorymethod;

public class UseVehicleFactory {
public static void main(String[] args) {
	vehicle seltos=VehicleFactory.newinstance("seltos");
	seltos.start();
	vehicle XCross=VehicleFactory.newinstance("XCross");
	XCross.honk();
}
}
