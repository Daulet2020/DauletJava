package Abstraction;



public abstract class Animals {
	
	public abstract void eat();
	
	public abstract void sleep();
	
	public static void main(String[] args) {
		
	}
}
//concrete
class Cat extends Animals {
	
	@Override
	public void eat() {
		System.out.println("Cat eats fish");
		
	}
	@Override
	public void sleep() {
		System.out.println("Cat sleeps 14 hours");
	}
	
}

class Tiger extends Animals{
	@Override
	public void eat() {
		System.out.println("Tiger eats meat");
		
	}
	@Override
	public void sleep() {
		System.out.println("Tiger sleeps 14 hours");
	}
}

class KingKong extends Animals{
	@Override
	public void eat() {
		System.out.println("King Kong eats Humans");
	}
	@Override
	public void sleep () {
		System.out.println("King Kong sleeps 5 hours");
	}
}

class Test {
public static void main(String[] args) {
	KingKong obj = new KingKong();
	obj.eat();
	
	Cat obj2 = new Cat();
	obj2.sleep();
	
	}	
}