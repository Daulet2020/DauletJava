package InitializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class StatcBlockPractice {
	
	public static String name; // "Sergei", "Daulet", "Apple"
	public static int [] arr1;
	
	public static ArrayList<String> list = new ArrayList<>();
	public static ArrayList<String> students = new ArrayList<>();
	
	public static String [] online = {"Arzagul", "Me", "Spike", "Savas", "Bahadir"};
	public static String [] inClass = {"Daryna", "Nadire", "Olga", "Miz"};
	
	public static double a =100;
	public int grade;
	
		
	static {
		name = "Daulet";
		arr1 = new int [3];   // {0, 0, 0};
		arr1 [1] = 2;
		list.add("Break");
		students.addAll(Arrays.asList(online));
		a =300;
	
	}
	
	static {
		name = "Sergei";
		arr1 = new int [5];   //{0, 0, 0, 0, 0};
		arr1[0] = 1;
		arr1[2] = 3;
		list.add("Coffee");
		list.add("Tea");
		
		students.addAll(Arrays.asList(inClass));
		
		a = 400;
		
		list.add(3, "Madina");   
	}
			
	public static void main(String[] args) {
		
		StatcBlockPractice obj = new StatcBlockPractice();
		System.out.println(name);  			//null
		System.out.println(Arrays.toString(arr1));
		System.out.println(list);
		System.out.println(students);
		
		a = 500;
		System.out.println(a);
		
		System.out.println(obj.grade);
		
	}
	
	public StatcBlockPractice() {
		name = "Apple";
		grade = 1000;
	}
}
