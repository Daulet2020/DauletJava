package Abstraction;

public abstract class Abstraction {
	
	public abstract void startTheCar();
	
}

class Toyota extends Abstraction  {
	
	@Override
	public void startTheCar() {
		System.out.println("Brake");
		System.out.println("Push the start button");
		System.out.println("Release button");
	}
	
	
	public static void main(String[] args) {
	//	Abstraction obj = new Abstraction();


	}

}

class Tesla extends Abstraction  {
	public void startTheCar() {
		 System.out.println("V@Overrideoice control");
		 System.out.println("Drive");
	}
	
}

