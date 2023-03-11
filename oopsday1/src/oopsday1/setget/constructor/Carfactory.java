package oopsday1.setget.constructor;

public class Carfactory {

	public static void main(String[] args) {
		Car jackr = new Car("green", 1500000, "suv", "mahindra");
		System.out.println(jackr);//output: iam mahindra
        System.out.println(jackr.hashCode());// it will give output oopsday1.setget.constructor.Car@4ec6a292 adding hashcode(will be unique) gives an id,1321640594
        System.out.println( Integer.toHexString(jackr.hashCode()));//output will be 4ec6a292
 //		jackr.setBrand("mahindra");
//		jackr.setModel("suv");
//		jackr.setColor("green");
//		jackr.setPrice(1500000);
//		System.out.println(jackr.getBrand());//output:mahindra
//		System.out.println(jackr.getModel());//output: suv
//		System.out.println(jackr.getColor());//output:green
//		System.out.println(jackr.getPrice());//output:1500000

//		 jackr is a car type
//		  jackr.color="green";
//		  jackr.price=1500000; 
//		  jackr.brand="mahindra"; 
//		  jackr.model="suv";
//		  System.out.println("Brand of the car is "+" "+jackr.brand);
//		  System.out.println("model of the car is"+" "+jackr.model);
//		  System.out.println("color of the brand is"+" "+jackr.color);
//		  System.out.println("price of the  car is "+" "+jackr.price);

//		  Car bmw=new Car();
//		  bmw.brand="BMW";
//		  bmw.model="x5";
//		  bmw.color="black";
//		 bmw.price=7500000; 
//		 System.out.println("Brand of the car is "+" "+bmw.brand);
//		 System.out.println("model of the car is"+" "+bmw.model);
//		  System.out.println("color of the brand is"+" "+bmw.color);
//		  System.out.println("price of the  car is "+" "+bmw.price);
//		Car bmw = new Car("black", 7500000, "x5", "BMW");//what come after new is call to the constructor(this is default constructor now)
//        System.out.println(bmw.hashCode());//output :457233904
//        System.out.println( Integer.toHexString(bmw.hashCode()));//output:1b40d5f0
//	bmw.setBrand("BMW");
//		bmw.setModel("X5");
//		bmw.setColor("black");
//		bmw.setPrice(7500000);
//		System.out.println(bmw.getBrand());//output:BMW
//		System.out.println(bmw.getModel());//output:X5
//		System.out.println(bmw.getColor());//output:black
//		System.out.println(bmw.getPrice());//output:7500000

	}

}
