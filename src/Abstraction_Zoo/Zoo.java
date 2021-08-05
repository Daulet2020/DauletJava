package Abstraction_Zoo;

public class Zoo {
	
	public static void main(String[] args) {
		Cat Cleo = new Cat('F', (byte)5, "White&Black", "Cleo");
		/*
		System.out.println("Name is: "+Cleo.Nickname);
		System.out.println("Gender is: "+Cleo.Gender);
		System.out.println("Color is: "+Cleo.Color);
		System.out.println("Age is: "+Cleo.Age);
		*/
		
		System.out.println("--------------------------------------");
		Cleo.getInfo();
		
		Cat Sergei = new Cat ('F', (byte)33, "White", "Sergei");
		Sergei.getInfo();
		Sergei.Sleep(5);
		Sergei.Eat("fish");
		Sergei.Drink("vodka");
		Sergei.Speak("Rus");
		System.out.println("-----------------------------------------------------------------");
		
		Dog Serg = new Dog('F', (byte)33, "White", "Serg");
		Serg.getInfo();
		Serg.Sleep(8);
		Serg.Drink("Vodka");
		Serg.Eat("Pork");
		Serg.Speak("Rus");
		

	}

}
