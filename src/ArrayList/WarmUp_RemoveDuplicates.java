package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WarmUp_RemoveDuplicates {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,8, 9, 7,2,2,3,3,3,3));
		System.out.println(remDup(list));
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,7,2,2,3,3,3,3));
		System.out.println(remDup1(list1));	
		
		String [] names = {"Denis", "Boris", "Boris", "Mahmud", "Sergei", "Sergei"};
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(names));
		System.out.println(list2);
		System.out.println(remDup2(list2));
		
		
	}
	//option 1, remove dup for Integer using for loop
	public static ArrayList<Integer> remDup1 (ArrayList<Integer> list1){
		ArrayList<Integer> result1 = new ArrayList<>();
		for (int i = 0; i < list1.size()-1; i++) {
			if(!result1.contains(list1.get(i))) {
				result1.add(list1.get(i));
			}
		}
	return result1;
	}
	
	//option 2, using each loop
	public static ArrayList<Integer> remDup (ArrayList<Integer> list){
		ArrayList<Integer> result = new ArrayList<>();
		for (Integer each : list) {
			if (!result.contains(each)) {
				result.add(each);
			}
		}
		return result;
	}

	//Task2, remove dup for String
	public static ArrayList<String> remDup2 (ArrayList<String> list){
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < list.size()-1; i++) {
			if(!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
		}
	return result;
	}
	
	// ArrayList methods: 	add(),  get(), clear(), set(), size(), indexOf(), lastIndexOf(), Arrays.asList(), 
	//						remove(), removeAll(),addAll(), contains()
	
	
	
}
