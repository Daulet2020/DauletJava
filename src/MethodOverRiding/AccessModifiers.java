package MethodOverRiding;

class Sergei {
	 protected void methodA() {
		System.out.println("Method A");
	}
	 
	 /*
	  public String MethodB(){
	  return "C";
	  */
	 
	 public double salary (double bonus ) {
		 return bonus+100000; 
	 }
}

/*
 modifiers need to be same or more visible
 		default ==> default , protected, public
 		protected ==> protected, public
 		public ==> public
 		private ==> cannot be overridden
 		
 		public > protected > default > private
 */


public class AccessModifiers extends Sergei  {
	
	 protected double salary(int bonus) {
		 return bonus+200000;
		 
	 }
	/*
	 @Override 
	 void methodA() {
		System.out.println("Method A");
	}
	
	override method access modifiers need to be same or more visible 
	*/
	@Override 
	public void methodA() {
		System.out.println("Method B ");
	}
	
	public static void main(String[] args) {
		AccessModifiers Method = new AccessModifiers();
		Method.methodA();
		
		
				
	}
	
}
