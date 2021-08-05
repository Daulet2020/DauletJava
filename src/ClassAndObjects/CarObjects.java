 package ClassAndObjects;

public class CarObjects {
	
	public static void main(String[] args) {
		
		Car 		car1 		=	new 	 	Car();
//     classname	objName			keyword		constructor
		car1.Brand = "BMW";
		car1.Color = "White";
		car1.Millage = 10000;
		car1.Model = "X6";
		car1.Price = 15000.5;
		car1.Year = 2000;
		
		System.out.println(car1.Brand);   	// BMW
		System.out.println(car1.Color); 	// White
		System.out.println(car1.Millage); 	// 10000
		System.out.println(car1.Model); 	//
		System.out.println(car1.Price);	  	//
		System.out.println(car1.Year);		//
		
		System.out.println("_________________________________________");
		
		Car car2 = new Car();
		System.out.println(car2.Brand);
		
		car2.Brand = "Toyota";
		car2.Model = "Corolla";
		car2.Color = "Black";
		car2.Millage = 12000;
		car2.Year = 2000;
		car2.Price = 12000.9;
		
		
		
		System.out.println(car2.Brand);   	// BMW
		System.out.println(car2.Color); 	// White
		System.out.println(car2.Millage); 	// 10000
		System.out.println(car2.Model); 	//
		System.out.println(car2.Price);	  	//
		System.out.println(car2.Year);		//
		
		System.out.println("_________________________________________");

		
		car1.drive();
		car2.drive();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		car1.start();
		car2.start();
		
		System.out.println("============================================");
		
		car1.getInfo();
		car2.getInfo();
		
		
		Car car3 = new Car();
		car3.Brand = "Lexus";
		car3.Model = "RX350";
		car3.Color = "Green";
		car3.Millage = 150000;
		car3.Year = 2007;
		car3.Price = 10500.9;
		
		car3.getInfo();
		
		
		
		
		
		
		
		
	}

}
