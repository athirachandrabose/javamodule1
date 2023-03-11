package oopsday1.setget;

public class Carfactory {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jackr=new Car();
		jackr.setBrand("mahindra");
		jackr.setModel("suv");
		jackr.setColor("green");
		jackr.setPrice(1500000);
		System.out.println(jackr.getBrand());
		System.out.println(jackr.getModel());
		System.out.println(jackr.getColor());
        System.out.println(jackr.getPrice());
		/*
		 * 
		 * //jackr is a car type
		 * jackr.color="green";
		 * jackr.price=1500000; 
		 * jackr.brand="mahindra"; 
		 * jackr.model="suv";
		 * System.out.println("Brand of the car is "+" "+jackr.brand);
		 * System.out.println("model of the car is"+" "+jackr.model);
		 * System.out.println("color of the brand is"+" "+jackr.color);
		 * System.out.println("price of the  car is "+" "+jackr.price);
		 */
//		
//		  Car bmw=new Car();
//		  bmw.brand="BMW";
//		  bmw.model="x5";
//		  bmw.color="black";
//		 bmw.price=7500000; 
//		 System.out.println("Brand of the car is "+" "+bmw.brand);
//		 System.out.println("model of the car is"+" "+bmw.model);
//		  System.out.println("color of the brand is"+" "+bmw.color);
//		  System.out.println("price of the  car is "+" "+bmw.price);
        Car bmw=new Car();
		bmw.setBrand("BMW");
		bmw.setModel("X5");
		bmw.setColor("black");
		bmw.setPrice(7500000);
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());
		System.out.println(bmw.getColor());
        System.out.println(bmw.getPrice());
		 
	}

}
