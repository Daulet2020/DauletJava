package ClassAndObjects;

public class CellPhones {
	
	String brand;
	String model;
	double screensize;
	String color;
	int price;
	
	public CellPhones() {
		brand ="iPhone";
		model = "10";
		screensize = 5.8;
		color="white";
		price = 650;
	}
	
	public CellPhones(String brand, String model, double screensize, String color, int price) {
		  		this.brand=brand;
		  		this.model=model;
		  		this.screensize=screensize;
		  		this.color=color;
		  		this.price=price;  
		
	}
	
	public void call(long PhoneNumber) {
		System.out.println(brand+" "+" is calling to "+PhoneNumber);
	}

	public void SendMessage(long PhoneNumber) {
		System.out.println("Sending message to "+PhoneNumber);
	}
	public void getInfo() {
		System.out.println(brand+", "+model+", "+color+", "+screensize+" $"+price);
	}
	
	
}
