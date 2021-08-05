package StaticKeyWord;

public class StaticVariables {
	
	static String name;
	static double staticNum;
		int num1;
	
	public static void method1() {
		System.out.println("Open the browser");
	}
	
	public static void main(String[] args) {
		
		 StaticVariables.method1();
  		
		StaticVariables obj1 = new StaticVariables();
		obj1.name="Daulet";
			
		StaticVariables obj2 = new StaticVariables();
		obj2.name = "Sergei";
		System.out.println(obj2.name);
		System.out.println(obj1.name);
		//_______________________________________
		
		System.out.println(StaticVariables.staticNum);			//0.0
		
		StaticVariables object = new StaticVariables();
		object.staticNum=4.5;
		System.out.println(object.staticNum);					//0.0
		
		object.staticNum = 5.5;
		
		StaticVariables object2 = new StaticVariables();		
		System.out.println(object2.staticNum);					//5.5
		System.out.println(object.staticNum);					//5.5
		
		  
		staticKeyWord.printHello();
	
	}

}
