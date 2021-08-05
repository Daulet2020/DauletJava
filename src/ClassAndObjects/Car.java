package ClassAndObjects;

public class Car {
	
	/*
	Car
	 	Attribute: model, year, brand, color.....
	  	Actions: start, stop, drive....
	
	 */

	String 	Model;
	int 	Year;
	String 	Color;
	double	Price;
	long 	Millage;
	String 	Brand;
	
	public void drive() {
		System.out.println("Driving car is "+Brand);
	}
	
	public void start() {
		System.out.println(Brand+" is started");
	}
	// 2020, Toyota corrola, white.....
	public void getInfo() {
		System.out.println(Year+" "+Brand+" "+Model+", "+Color+", $"+Price);
		
	}
	
	
	
	
}
