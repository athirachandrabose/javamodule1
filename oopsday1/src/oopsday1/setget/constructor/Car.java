package oopsday1.setget.constructor;

public class Car {
	
	
	private String color;//data members,instance variablesysout
	 private double price;
	private String model;
	private String brand;
public Car() {//default constructor ctrl+space
	// TODO Auto-generated constructor stub
}
	public Car(String color, double price, String model, String brand) {//CONSTRUCTOR
	super();
		this.color = color;
		this.price = price;
	this.model = model;
	this.brand = brand;
	}
	
     public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		//return "Car [color=" + color + ", price=" + price + ", model=" + model + ", brand=" + brand + "]";
	    return "iam "+ brand;
	}
	  


}
