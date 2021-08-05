package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayList_Practice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <=30; i++) {
			if(i%2==0) {
				continue;
			}
			list.add(i);
		}
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		} System.out.println();
		
		for (Integer each:list) { 				//autobox
			System.out.print(each+" ");
		}
		
		int num = list.get(7);    				//unbox
		System.out.println(num); 				// index of 7 is 14
		
		// list.clear();							// clears all and returns empty []
		
		System.out.println(list.get(2) );       // out of bound
		
		//sorting the ArrayList:
		Collections.sort(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 20; i >=0; i--) {
			list2.add(i);
		} 
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		
		
		
	}

}
