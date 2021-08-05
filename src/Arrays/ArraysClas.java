package Arrays;

import java.util.Iterator;

public class ArraysClas {
	
	public static void main(String[] args) {
	
		int a = 10;
		int [] arr = {10, 20, 30 };
		
		int arr1 [] = {10, 20, 30};
		
		char [] arr2 = {'A', 'B', 'C'};
		
		String arr3 [] = {"Daulet", "Tomiris", "Assel"};
		
	//	String name = arr3[3]; // index 3 is not exist
		String name1 = arr3[2];
		
		System.out.println(name1);
		
		int [] arr5 = new int [3]; // size ONLY 0, 1, 2
		arr5 [0] = 100;
	//	System.out.println(arr5[3]); // out of bound
		
		byte [] MyNum1 = new byte[5];
		for (byte i = 0; i < MyNum1.length; i++) {
			System.out.println(MyNum1[i]);
		}
		int [] MyNum = new int[5];
		for (int i = 0; i < MyNum.length; i++) {
			System.out.println(MyNum[i]);
		}
		
		String [] names = new String[3];
		for (int i = 0; i < names.length; i++) {
			System.out.println("empty " + names[2]);
		}
		
		int ch[] = new int[3];
		ch[0]=10;
		ch[1]=20;
		ch[2]=30;
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
		int[] array1= {1,2,3,9,12};
		int[] array2= {4,5,6};
				
		int[] array3 = new int [array1.length+array2.length];
		
		for (int i = 0; i < array1.length; i++) {
			array3 [i]= array1[i]; // assigned all value of array1 to array3
		}
		for (int i = 0; i < array2.length; i++) {
			array3[i+array1.length] = array2[i]; // assigned all value of array2 to array3 remained index
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]+" ");
		}
		
		
	}

}
