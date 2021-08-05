package ClassAndObjects;

public class EmployeeObjects {
	public static void main(String[] args) {
		
		Employee pers1 = new Employee("Sergei", "005", "Tester", 6532, 33, 100000);
		pers1.getInfo();
		
		Employee pers2 = new Employee("Daulet", "001", "Master", 32689, 44, 150000);
		pers2.getInfo();
	}

}
