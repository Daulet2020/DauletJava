package Abstraction_Zoo;

public class Dog extends Animal {
	public Dog(char Gender, byte Age, String Color, String Nickname) {
		super(Gender, Age, Color, Nickname);
		
	}

	@Override
	public void Speak(String language) {
		System.out.println(Nickname+" speaks "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname+ " eats "+food);
		
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+" sleeps "+hour+" hours");
		
		
	}

	@Override
	public void Drink(String drink) {
		System.out.println(Nickname+" drinks "+drink);
		
	}

	

}
