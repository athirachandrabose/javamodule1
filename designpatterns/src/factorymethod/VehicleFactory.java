package factorymethod;

public class VehicleFactory {
public static vehicle newinstance(String car) {
	vehicle Vehicle= null;
	if(car==null) {
		return null;		
	}
	else if(car.equals("seltos")) {
		Vehicle=new seltos();
	}
	else if(car.equals("XCross")){
		Vehicle=new XCross();
	}
	return Vehicle;
}
}
