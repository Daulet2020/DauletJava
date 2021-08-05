package OOP_Encapsulation;

public class Test {

	public static void main(String[] args) {
		
		TestData obj = new TestData();
//		System.out.println(obj.name); // the data is private
		
		System.out.println(obj.getName()); 
		
		String str = obj.getName();
		System.out.println(str);
		
		System.out.println(obj.getID());
		
	
		obj.setName("Sergei");
		System.out.println(obj.getName());
		 
		obj.setID(7980);
		System.out.println(obj.getID());
		
		obj.setID(12345);
		System.out.println(obj.getID());
		
	}  
}
