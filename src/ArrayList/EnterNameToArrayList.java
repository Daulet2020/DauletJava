package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterNameToArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		// add method:
		nameList.add("Daulet");
		nameList.add("Apple");
		System.out.println(nameList);
		
		/* 	create an ArrayList called studentNames
			create scanner object called scan
			
			
		*/
		Scanner scan = new Scanner(System.in);
		ArrayList<String> studentName = new ArrayList <>();
		while(true) {
			System.out.println("Enter your name please");
		String name = scan.nextLine();
		studentName.add(name);
		
		System.out.println("New name?");
		
		String answer = scan.nextLine().toLowerCase();
		if(!(answer.equals("yes") || answer.equals("no"))) {
			System.out.println("Invalid");
			break;
		}
		if (answer.equals("no")) {
			break;
		}
	}
		System.out.println(studentName);

	}
	
}
