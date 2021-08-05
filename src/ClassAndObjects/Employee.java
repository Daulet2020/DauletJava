package ClassAndObjects;

public class Employee {
	
	String 	Name;
	String 	ID;
	String	Title;
	int		SSN; 
	int 	Age;
	double Salary;
	
	public Employee(String Name, String ID, String Title, int SSN, int Age, double Salary) {
		this.Name = Name;
		this.ID = ID;
		this.Title=Title;
		this.SSN=SSN;
		this.Age=Age;
		this.Salary=Salary;
	}
	
	
	
	public void getInfo() {
		System.out.println("Name: "+Name);
		System.out.println("ID is: "+ID);
		System.out.println("Title: "+Title);
		System.out.println("SSN: "+SSN);
		System.out.println("Salary: $"+Salary);
		System.out.println("Age: "+Age);
		
		System.out.println("______________________________________");
	}
	
		
	
}
