package Arrays;

import java.util.Scanner;

public class ArraysPractice {
	public static void main(String[] args) {
		String student1 = "Daulet";
		String student2 = "Sergei";
		String student3 = "Assel";
		String student4 = "Ibrahim";

		String [] AllStudents = {"Daulet", "Sergei", "Assel", "Ibrahim" };
		AllStudents[0] = "Tomiris";
		System.out.println(AllStudents[1]);


		int [] array = new int [4];
		System.out.println(array.length);
		
		array[1] = 100;
		array[0] = 200;
		
		System.out.println(array[0]); //200
		
		Scanner scan = new Scanner(System.in);
		int [] Inputs = new int[5];
		for (int i = 0; i < Inputs.length; i++) {
			System.out.println("Enter number ");
		Inputs[i] = scan.nextInt();
		}
		for (int i = 0; i < Inputs.length; i++) {
			System.out.println( Inputs[i]+" ");
			
		}
		
		
		String[] AllStudentsNames = new String [235];
		
		
		
		
	}

}
