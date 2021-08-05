package ClassAndObjects;

public class DogObjects {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.Breed = "Husky";
		dog1.Size = "Small";
		dog1.Age = 10;
		dog1.Name = "Laika";
		dog1.Gender = 'F';
		dog1.Food = "Meat";
		
		System.out.println(dog1.Breed);
		System.out.println(dog1.Size);
		System.out.println(dog1.Age);
		System.out.println(dog1.Name);
		System.out.println(dog1.Gender);
		
				
		Dog dog2 = new Dog();
		
		dog2.Breed = "Greyhound";
		dog2.Size = "Big";
		dog2.Age = 5;
		dog2.Name = "Aksuiek";
		dog2.Gender = 'M';
		dog2.Food = "Sushi";
		
		
		
		dog1.getInfo();
		dog2.getInfo();
		
		System.out.println("=====================================================================");
		
		dog1.eat();
		dog2.eat();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		dog1.play();
		dog2.play();
		
		String str = new String ("Hello");
		str.toLowerCase();
		
	}

}
