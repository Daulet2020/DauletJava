package OOP_Encapsulation;

public class Amazon {
	
	public static void main(String[] args) {
	
	EmployeeInfo person1 = new EmployeeInfo();
	
	person1.setName("Segrei");
	System.out.println(person1.getName());
	
	person1.setSSN(123456);
	System.out.println(person1.getSSN());
	
	person1.setAge((byte) 45);
	System.out.println(person1.getAge());
	
	person1.setSalary(1234.321);
	System.out.println(person1.getSalary());
	
	
	System.out.println("______________________________________________");
	
	EmployeeInfo person2 = new EmployeeInfo();
	person2.setName("Daulet");
	person2.setSSN(123456);
	person2.setAge((byte) 35);
	person2.setSalary(98765.321);
	
	
	System.out.println(person2.getName());
	System.out.println(person2.getSSN());
	System.out.println(person2.getAge());
	System.out.println(person2.getSalary());
	
	System.out.println("----------------------------------------------------");
	
	EmployeeInfo person3 = new EmployeeInfo();
	person3.setInfo("Assel", 123654, (byte)40, 986523);
	
	System.out.println(person3.getName());
	System.out.println(person3.getSSN());
	System.out.println(person3.getAge());
	System.out.println(person3.getSalary());
	
		
	}

}
