package ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsPractice {
	
	public static void main(String[] args) {
		
		//set (index number, Object):
		ArrayList<String> Javengers = new ArrayList<>();
		Javengers.add("Jena");			// 0
		Javengers.add("Lana");			// 1
		Javengers.add("Dan");			// 2
		Javengers.add("Dina");			// 3
		
		Javengers.set(1, "Fifa");
		System.out.println(Javengers);
		
		
		// remove(int): removes the index
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		nums.remove(3); 
		System.out.println(nums);
		nums.remove(Integer.parseInt("3"));
		nums.remove(Integer.valueOf("3"));
		
		System.out.println(nums);
		
		
	}

}
