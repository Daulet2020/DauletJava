package ArrayList;

import java.util.ArrayList;

public class ArrayListReviewMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();
		
		// add method (object):
				ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("Apple");			// index: 0, size: 1
		shoppingList.add("Orange");			// index: 1, size: 2
		shoppingList.add("Grape"); 			// index: 2, size: 3
		System.out.println(shoppingList);
	
		// add method (index, object): adds the object at the given index number
		shoppingList.add(0, "Strawberry");
		System.out.println(shoppingList);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(0, 5);
		nums.add(1, 10);
		nums.add(2, 15);
		nums.add(0, 1);
		System.out.println(nums);
		

		// get (index number): returns the object
		ArrayList<String> names = new ArrayList<>();
		names.add("Daulet");
		names.add("Tomiris");
		names.add(1, "Assel");
		names.add(0, "Dimash");
		
		String str1 = names.get(1);
		System.out.println(str1);

		//size(): returns the length of the ArrayList
		int length = names.size();
		System.out.println(length);
		
		for (int i = 0; i < names.size(); i++) {
		String each = names.get(i)+" ";
			System.out.print(each);
		}
		System.out.println();
		for (String each : names ) {
			System.out.print(each+" ");
		}
		System.out.println();
		
		
		// clear(): removes everything from ArrayList
		ArrayList<String> name = new ArrayList<>();
		name.add("Sergei");
		name.add("Andrei");
		name.add(1, "Serik");
		name.add(0, "Berik");

		System.out.println(name);
		System.out.println(name.size());
		name.clear();
		System.out.println(name);
		System.out.println(name.size());
		
		//set(index number, object): 
		ArrayList<String> name1 = new ArrayList<>();
		name1.add("Assel");
		name1.add("Saera");
		name1.add("Alma");    // replaced index 2 to Alex
		name1.add("Marzhan");
		name1.add("Aigul");

		name1.set(2, "Alex");
		System.out.println(name1);
		
		
		// contains (): checks if the given object contains in the ArrayList or not, and returns boolean value
		ArrayList<String> goodGuys = new ArrayList<>();
		goodGuys.add("Apple");
		goodGuys.add("Samsung");
		goodGuys.add("LG");
		goodGuys.add("TCL");
		goodGuys.add("Sony");
		
		boolean result = goodGuys.contains("Apple");
		System.out.println(result);
		
		// equals(ArrayList): checks if the two ArrayList are equal or not, and returns boolean value
		ArrayList<String> Brands = new ArrayList<>();
		Brands.add("HP");
		Brands.add("Xiaomi");
		Brands.add("Amazon");
		Brands.add("Ebay");
		Brands.add("Sony");
		
		
		boolean result1 = Brands.equals(goodGuys);
		System.out.println(result1);
		
		if(goodGuys.contains("Sony") && Brands.contains("Sony"));
		System.out.println("Sony the best");
		
		
		//remove(int): removes the given index
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(1); // index 0
		lists.add(2); // index 1
		lists.add(3); // index 2
		lists.add(4); // index 3
		
		lists.remove( 1 ); // [1, 3, 4, 5]
		lists.remove( 2 ); // [1, 3, 5]
		lists.remove( 1 ); // [1, 5]
		System.out.println(lists);
		System.out.println(lists.size());
		
		//remove(Integer): removes the first matching object, at the same time returns boolean value
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(1); // index 0
		list3.add(2); // index 1
		list3.add(3); // index 2
		list3.add(4); // index 3
		
		Integer a = 1;
		boolean r1 = list3.remove(a);
		
		System.out.println(list3);
		System.out.println(r1);
		
		ArrayList<String> city = new ArrayList<>();
		city.add("Miami");
		city.add("Miami");
		city.add("LA");
		city.add("Houston");
		city.add("Dallas");
		
	//	city.remove("Miami"); 
		
		if (city.remove("Miami")) {
			city.remove(2);
		}
		System.out.println(city); //[Miami, LA, Dallas]
		
		city.add(2, "Almaty");
		System.out.println(city); //[Miami, LA, Almaty, Dallas]
		
		ArrayList<Integer> price = new ArrayList<>();
		price.add(1);
		price.add(2);
		price.add(3);
		price.add(4);
		price.add(5);
		
		price.remove(Integer.parseInt("2")); // returns primitive
		System.out.println(price);
		
		boolean r3 = price.remove(Integer.valueOf("3"));
		System.out.println(price);
		System.out.println(r3);
		

	}

}
