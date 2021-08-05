package Interface;

public class Dealership {
	public static void main(String[] args) {
		
		Tesla_Model3 obj1 = new Tesla_Model3();
		obj1.start();
		obj1.fly();
		
		System.out.println("_____________________________________________");
		
		Jeep_wrangler obj2 = new Jeep_wrangler();
		obj2.start();
		obj2.PumpGas();
		
		System.out.println("_____________________________________________");
		
		ToyotaHybird obj3 = new ToyotaHybird();
		obj3.SelfDrive();
		
		
	}

}
