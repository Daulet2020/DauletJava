package JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {
	
	
	
	// static ChromeDriver driver = new ChromeDriver();
	/*
	 static {
	 	driver.manage().window().maximize();
	 }
	 */
	
	static String []  arr = new String [3];
	static ArrayList<String> list = new ArrayList<>();
		double Salary;
	
	
	static {
		System.out.println("static block");
		
		arr[2] = "Alla";
		arr[0] = "Dana";
		arr[1] = "Dorra";
		
		list.addAll(Arrays.asList(arr));
		
		StaticBlock obj1 = new StaticBlock();
		obj1.Salary = 7000;
		System.out.println(obj1.Salary);
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		StaticBlock obj1 = new StaticBlock(); 		//0.0
		obj1.Salary = 5000;	
		System.out.println(obj1.Salary);			//5000.0
		
	}

}
