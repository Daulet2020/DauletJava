package Collections;

import java.util.*;


public class ListInterface {
	
	public static void main(String[] args) {
		
		/*
		 Array: Collection of Data (same data type):
		 				size is fixed 
		 				index numbers
		 				can be multi-dimensional
		 				supports primitives & objects
		 				can have duplicates
		 
		 Collections framework: consists of multiple interfaces, each interfaces has multiple implementations
		 		Interfaces in Collections frame work:
		 		1.  Iterable
		 		2.  Collection
		 		3.  List
		 		4.  Set
		 		5.  SortedSet
		 		6.  Queue
		 		7.  Deque
		 	all those interfaces are presented in java.util packageThey  
		 	
		 	ONLY supports Objects
		 	
		 	Iterable (I): root interface, super type of all the interfaces in collections framework
		 	
		 	Collection (I): extended by three interfacses: List(I), Set(I), Queue(I)
		 	
		 		List(I):  implemented By ArrayList(C), LinkedList(C), Vector(C)
		 				has index numbers, dynamic sized, accepts duplicates
		 	
		 	List<Integer> list1 = new ArrayList<>();
		 	List<String> list2 = new LinkedList<>();
		 	List<Double> list3 = new Vector<>();
		 	List<Integer> list4 = new Stack<>();
		 	
		 	ArrayList: array based class, internally uses the array
		 	
		 	LinkedList:  each objects are doublly linked in the LinkedList
		 	
		 			doublly linked: adding & removing ( add(), remove() ) data are faster
		 			
		 			retriving data ( get() ) is slower
		 					is not array based class
		 		 
		 */
		
		//	List<Integer> list1 = new List<>();

			List<Integer> list2 = new ArrayList<>();
			List<Integer> list3 = new LinkedList<>();
			List<Integer> list4 = new Vector<>();
			
			List<Integer> arraylist = new ArrayList<>();
					arraylist.add(10);
					arraylist.add(20);
					arraylist.add(30);
					arraylist.remove(1);
					
					System.out.println(arraylist);
					
					
			List<Integer> linkedlist = new LinkedList<>();
					linkedlist.add(10);
					linkedlist.add(20);
					linkedlist.add(30);
					linkedlist.remove(1);
					
					System.out.println(linkedlist);
					
			System.out.println("================================================");

			String[] arr = {"A", "B", "B"};
			
			List <String> Notlinked = new ArrayList<>(Arrays.asList(arr));
			
			LinkedList <String> linked = new LinkedList<String>(Arrays.asList(arr));
			
			System.out.println(linked);
			
			/*
			 Vector: is synchronized, only preferred in  multi-threads
			 
			 	advantage: thread safe in multi-thread environment
			 	dis-advantage: slower
			 	
			 	has a child class: Stack
			 	Stack: synchronized
			 		pop(): LIFO ==> Last in First Out
			 			removes the last object from the stack
			 			
			 	
			 			
	synchronized keyword:  used to achieve ==> Thread safe in  multi-thread environment
	
	multi-thread Environment: multiple threads try to get access to same resources
			  			 
			 */
			
			Vector<Integer> vt = new Vector<Integer>();
				vt.add(1);
				
			System.out.println("==============================================");
				
				Stack<Integer> st = new Stack<Integer>();
					st.add(1);
					st.add(2);
					st.add(3);
					st.add(4); // pop-out
					
					System.out.println(st); 
					  
					System.out.println(st.pop()); // Last in last out ---> eliminated 4
					
					System.out.println(st);
				 
					System.out.println(st.pop()); // Last in last out --->  eliminated 3
					
					System.out.println(st);
			
			
	}
	
	//arraylist:
	public void add1(int a) {
		
	}
	
	//vector
	public synchronized void add2() {
		
	}
	
	

}
