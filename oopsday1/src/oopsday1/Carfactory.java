package oopsday1;

public class Carfactory {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Car jackr=new Car();//jackr is a car type
          jackr.color="green";
          jackr.price=1500000;
          jackr.brand="mahindra";
          jackr.model="suv";
          System.out.println("Brand of the car is "+" "+jackr.brand);
          System.out.println("model of the car is"+" "+jackr.model);
          System.out.println("color of the brand is"+" "+jackr.color);
          System.out.println("price of the  car is "+" "+jackr.price);
          Car bmw=new Car();
          bmw.brand="BMW";
          bmw.model="x5";
          bmw.color="black";
          bmw.price=7500000;
          System.out.println("Brand of the car is "+" "+bmw.brand);
          System.out.println("model of the car is"+" "+bmw.model);
          System.out.println("color of the brand is"+" "+bmw.color);
          System.out.println("price of the  car is "+" "+bmw.price);
	}

}
