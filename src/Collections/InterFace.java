package Collections;

import java.util.*;


public class InterFace {
	
public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		    list1.addAll(Arrays.asList(100,100,100));
		    System.out.println(list1);
		    System.out.println(list1.get(0));
		
		
		
		
		Set<Integer> st1 = new HashSet<>();
		st1.add(100);
		st1.add(100);
		st1.add(100);
		System.out.println(st1);
		
		
		System.out.println("=========================");
		
		Set<Integer>hashset = new HashSet<Integer>();
		hashset.add(100);
		hashset.add(10);
		hashset.add(5);
		hashset.add(1);
		hashset.add(10);
		
		System.out.println(hashset);
		
		Set<Integer>linkedhashset = new LinkedHashSet<>();
		linkedhashset.add(100);
		linkedhashset.add(10);
		linkedhashset.add(5);
		linkedhashset.add(1);
		linkedhashset.add(10);
		
		System.out.println(linkedhashset);
		
		SortedSet<String> treeset = new TreeSet<>();
		treeset.add("A");
		treeset.add("C");
		treeset.add("B");
		treeset.add("W");
		treeset.add("B");
		System.out.println(treeset);
		
		List<Integer>list = new ArrayList<>();
		list.addAll(Arrays.asList(10, 9, 8, 7, 6, 10, 10, 10));
		Collections.sort(list);
		
		System.out.println(list);
		
		
	
		
		List<Integer>list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(10, 9 ,8 ,7, 6, 10 , 10 ,10));
		TreeSet<Integer> ts  = new TreeSet<>(list2);
		System.out.println(ts);
		
		
		
		
		String str = "ABCFHHHYYYEEERRRI";
		String[] arr = str.split("");
		System.out.println(Arrays.toString(arr));
		LinkedHashSet<String> nodup = new LinkedHashSet<>(Arrays.asList(arr));
		String result = nodup.toString().replace("[", "").replace("]", "").replace(", ", "");
		System.out.println(result);
		
		
		String str2 = new LinkedHashSet<String>(Arrays.asList(arr)).toString();
		System.out.println(str2);
		
		
		
		
		
		
		
	}
	
}