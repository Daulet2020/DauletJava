package Polymorphism;

/*
 		Polymorthism: objects to behave in multiple forms
 		2 important rules of Polymorphism: 
 			1) reference type decides what is accessible and what can be used
 			2) reference type  can be parent class or interface, and objects can be any sub class
 			
 
 */

class Animal{
	public void Talk() {
		System.out.println("Animal is talking");
	}
	
}

class Tiger extends Animal {
	public void Hunt () {
		System.out.println("Tiger is hunting");
	}
	public void Talk() {
		System.out.println("Tiger is Roaring");
	}
	
}

class Octopus extends Animal {
	public void Swim () {
		System.out.println("Octopus is swimming");
	}
	
	public void Talk () {
		System.out.println("Octopus is gogloglog");
	}
	
	
}



public class Zoo {
	public static void main(String[] args) {
		Tiger tiger1 = new Tiger();
		
		Tiger [] Tigers = {tiger1, new Tiger() };
		
		Octopus octopus1 = new Octopus();
		Octopus [] octopus = {octopus1, new Octopus()  };
		
		Animal animal1 = new Tiger();
		animal1.Talk();
		
		Animal animal2 = new Octopus();
		animal2.Talk();
		
	}

}
