package JavaReview;

import java.util.Arrays;

public class InstanceBlock {
	
	String [] names = new String [3];
	
	{
		System.out.println("Instance block");
		names[2] = "Sergei";
		names[1] = "Seyfo";
		names[0] = "Lolla";
		
		// names[3] = "Masya";
	}
	
	public InstanceBlock() {
		System.out.println("Constructor");
		names[2] = "Vasya";
		names[1] = "Petya";
		names[0] = "Rana";
	}

	public static void main(String[] args) {
		
		InstanceBlock obj = new InstanceBlock();
		
		System.out.println("Main method");
		System.out.println(Arrays.toString(obj.names));
		
		InstanceBlock obj1 = new InstanceBlock();
		
		int a = 10;
		a = 20;
		System.out.println(a);
		
	}
}
