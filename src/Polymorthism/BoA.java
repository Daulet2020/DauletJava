package Polymorthism;

import java.util.ArrayList;
import java.util.Arrays;

/*
 		Polymorthism: behavior of the object in multiple ways
 			
 			occurs when parent class/Interface is reference type, and object is created from sub class(non abstract)
 			
 			if abstract class is reference type, object needs to be created from non abstract sub class
 			
 			if interface is reference type, object needs to be created from the classes that`s implementing the interface
 					Ex: WebDriver driver = new ChromeDriver();
 								driver.get();
 								driver.navigate();
 								......
 		
 		IS A: is inherited relationship between classes
 		
 		HAS A: if one class is used in another class (contains)
 		
 		
 		We cannot create objects from interface and abstract classes, coz abstraction is not concrete
 		
 		Reference Type decides what can be accessible
 
 */



abstract class ScrumTeam{
	String name, jobTitle;
	double salary;
	
	public abstract void DailyStandUp();
	public abstract void Demo();
	
	public void getEmployeeInfo() {
		System.out.println("=================================================");
		System.out.println("Employee name "+name);
		System.out.println("Job Title " + jobTitle);
		System.out.println("Salary is $"+salary);
		System.out.println("=================================================");
	}
}

class Testers extends ScrumTeam {
	/*
	 Name, jobTitle, salary
	 */
	
	public Testers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	@Override
	public void DailyStandUp() {
		System.out.println("Tester "+name+" is talking");
		
		
	}

	@Override
	public void Demo() {
		System.out.println("Tester "+name+" is doing demo");
		
	}
}

class Developers extends ScrumTeam {
	
	/*
	 Name, JobTitle, Salary
	 */
	
	public Developers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	@Override
	public void DailyStandUp() {
		
		
	}

	@Override
	public void Demo() {
		
		
	}
	
}

public class BoA {
	public static void main(String[] args) {
		ScrumTeam Daulet = new Testers("Daulet", "SDET", 130_000);
		ScrumTeam Sergei = new Testers("Sergei", "junior QA", 100_000);
		ScrumTeam Assel = new Testers("Assel", "Lead team", 150_000);
		
		ScrumTeam [] testers = {Daulet, Sergei, Assel};
		/*for (Testers each: testers) {
			each.getEmployeeInfo();
		}*/
		
		ScrumTeam Ermek = new Developers("Ermek", "Senior", 135_000);
		ScrumTeam Tomi = new Developers("Tomi", "Lead", 155_000);
		ScrumTeam Dimash = new Developers("Dimash", "Developer", 125_000);
		ScrumTeam Alan = new Developers("Alan", "Junior", 115_000);
		
		ScrumTeam[] developers = {Ermek, Tomi, Dimash, Alan};
		/*for (Developers each: developers) {
			each.getEmployeeInfo();
		}*/

		ArrayList<ScrumTeam> scrum = new ArrayList<>();
		scrum.addAll(Arrays.asList(testers));
		scrum.addAll(Arrays.asList(developers));
		for(ScrumTeam each:scrum) {
			each.getEmployeeInfo();
		}
	}
	

}
