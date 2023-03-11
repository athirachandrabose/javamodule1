package oopsday1.withbusinessmethod;

public class Carfactory {

	public static void main(String[] args) {
		Car jackr = new Car("green", 1500000, "suv", "mahindra");
		System.out.println(jackr);
        System.out.println(jackr.hashCode());
        jackr.start();
        jackr.changegear(0);
        jackr.stop();
	}

}
