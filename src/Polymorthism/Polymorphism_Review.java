package Polymorthism;

/*
 	Polymorphism occurs when a super class/interface is reference and object from created child class
 */
class A{
	
	protected void MethodA () {
		System.out.println("method A from A class");
	}
	
	
	
}

class B extends A{
	public void methodB() {
		System.out.println("method B");
	}
	public void methodA() {
		System.out.println("Method A from B class");
	}
	
}


public class Polymorphism_Review {
	public static void main(String[] args) {
		
		A obj = new A();
		A obj2 = new B();
		
		obj2.MethodA();
	//	obj2.MethodB();
		
	//	B obj3 = new A();  // child cannot to be reference to parent class object
		
	//	C obj4 = new C();	//abstract class is not concrete
		
		C obj5 = new D();
		E obj6 = new D();
	//	D obj7 = new E();	// we cannot create object from interface
	//	C obj8 = new E();	// we cannot create object from interface
	//	E obj9 = new C();	// we cannot create object from abstract
	//	E obj10 = new F(); 	// we cannot create object from abstract
		A obj11 = new B();
		obj11.MethodA();
		
		
		
	}

}

abstract class C {
	
}

class D extends C implements E {
	
}

interface E {
	
}

abstract class F implements E {
	{
}
	
}