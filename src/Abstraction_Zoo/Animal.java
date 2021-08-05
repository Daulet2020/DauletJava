package Abstraction_Zoo;

public abstract class Animal {
	
	public char Gender;
	public byte Age;
	public String Color;
	public String Nickname;
	
	public Animal (char Gender,byte Age,String Color, String Nickname  ) {
		this.Gender = Gender;
		this.Age = Age;
		this.Color = Color;
		this.Nickname = Nickname;
	}
	
	//Actions: Speak(), Eat(), Sleep(), Drink();
	
	public abstract void Speak(String language);
	public abstract void Eat(String food);
	public abstract void Sleep(int hour);
	public abstract void Drink(String drink);
	
	public void getInfo() {
		System.out.println("Nickname is: "+Nickname);
		System.out.println("Gender is: "+Gender);
		System.out.println("Color is: "+Color);
		System.out.println("Age is: "+Age);
	}

}
