package MethodOverRiding;

class  student {
	
	public void printName () {
		System.out.println("Daulet");
	}
}


/*
 Override VS overload:
 	Overload: 	access modifier can be same or different  
 				return-type can be same or different  parameters MUST be different
 				any method can be overload  
 				method name MUST be same  
 				can happen in the same class.
 	Override: 	access modifier needs to be same or more visible. 
 				The method MUST be inheritable to the sub class  
 				Return type MUST be same  
 				method name Must be same  
 				parameters MUST be same
  				only instance methods can be override  
  				MUST be override in sub class  
  
  @Override annotation MUST be applicable
  
  	override benefits:
  			readable, 
  			reusability, 
  			flexible
 */

	public class MethodOverriding extends student {

	
	public void print (String str) {
		
	}
	
	public void print (double a) {
		
	}
	
	public void printName () {
		System.out.println("Sergei");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding();
				obj.printName(); 
		
		student obj2 = new student();
				obj2.printName();
	}
		
	}

 
