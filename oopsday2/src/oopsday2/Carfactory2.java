package oopsday2;

public class Carfactory2 {
public static void main(String[] args) {
//CarIface car=new CarIface();
	//CarIface car;//not referring to any object
	CarIface car= new Car(5000,50,0,false);
	car.start();
	car.honk();
	car.move();
	car.stop();
	System.out.println(car);
}
}
