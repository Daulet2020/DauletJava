package ClassAndObjects;

public class Dog {
	
	/*
	 Dog:
	 	Attribute: breed, size, age, color, name
	 	
	 	Actions: eat, sleep, bark, play.....
	  
	 */
	
	String 	Breed;
	String 	Size;
	byte 	Age;
	String 	Name;
	char	Gender;
	String Food;
	
	
	public void getInfo() {
		System.out.println(Breed+", "+Size+", "+Age+", "+ Name+", "+Gender);	
		}
	
	public void eat() {
		System.out.println(Name+" is eating meat "+Food);
	}

	public void play () {
		System.out.println(Breed+" is playing");
	}
	
	
}
