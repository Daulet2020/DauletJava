package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods2 {
	
	/*
	 remaining methods:
	 	indexOf(), 	lastIndexOf()
	 	
	 	converting array to arraylist
	 	
	 	 removeAll(), 	addAll();
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);						// auto boxing
		list.add(Integer.valueOf("33")); 	// none
		list.add(Integer.parseInt("100"));	// auto boxing
		list.add(200);
		list.add(20);
		list.add(1);
		
		//indexOf(Object): return index number
		int a = list.indexOf(1); 					// auto boxing
		System.out.println(a);
		int a2 = list.indexOf(200);
		System.out.println(a2);
		
		//lastIndexOf(Object): returns last occured object` index number (last index)
		
		int a3 = list.indexOf(1);
		int a4 = list.lastIndexOf(1);
		System.out.println(a3);
		System.out.println(a4);
		
		//Arrays.asList(Object Array): used for converting object arrays to List Interface
		
		Integer [] arr = {1, 2, 3, 4};
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
		list2.add(100);
		System.out.println(list2);
		
		
		String [] arr2 = {"Java", "Python", "C#", "C++"};
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr2));
		
		//isEmpty(): checks if ArrayList is empty and returns boolean expression
		System.out.println(list3.isEmpty());
		list3.add("Fuck");
		
		System.out.println(list3);
		
		int [] arr3 = {1, 2, 3, 4, 5};
		// ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr3));	 		// only the object array can be converted
		
		
		
		// addAll(Interface): used for storing multiple objects to ArrayList 
		String [] allNames = {"Silver", "Platin", "Wood"};
		
		ArrayList<String> names = new ArrayList<>();
			names.addAll(Arrays.asList("Almaz", "Briliant", "Gold"));
		
			names.addAll(Arrays.asList(allNames));
			System.out.println(names);
		
		//removeAll(Interface): removes all the matching objects
			ArrayList<Integer> numbers = new ArrayList<>();
			numbers.addAll(Arrays.asList(1, 1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,4));
			System.out.println(numbers);
			
			numbers.removeAll(Arrays.asList(1,2));
			System.out.println(numbers);
			
	/*	//removed() method not designed for loop
			ArrayList<Integer> lis = new ArrayList<>();
			lis.addAll(Arrays.asList(1,1,1,2,2,2,2,3,4,2,1));
			
			for (int i = 0; i < lis.size(); i++) {
				if(lis.get(i)==1) {
					lis.remove(i);
				}
			}
			System.out.println(lis);
	*/
			
		//	arrayList sorting: 
			
			Integer []array = {1000, 900, 80, 765, 123, 456};
			
			ArrayList<Integer> price = new ArrayList<>();
			price.addAll(Arrays.asList(array));
			
			System.out.println(price);
			
			Collections.sort(price);
			System.out.println(price);
		
	}

}
