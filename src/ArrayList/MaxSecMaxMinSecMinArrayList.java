package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSecMaxMinSecMinArrayList {
	
	
	public static void main(String[] args) {
		
				
		//Maximum
		ArrayList<Integer>Max= new ArrayList<>(Arrays.asList(1000, 900, 80, 765, 123, 456));
		int m = Max(Max);
		System.out.println(m);
		//Minimum
		int m1= Min(Max);
		System.out.println(m1);
		
		//Second Maximum
		ArrayList <Integer> list = new ArrayList<Integer>(Arrays.asList(1,2203,3,15,85, 985));
		int secondMax = SecMax(list);
		System.out.println(secondMax);
		 
		//Second Minimum
		ArrayList <Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2203,3,15,85, 985));
		int secondMin = SecMin(list1);
		System.out.println(secondMin);
	}
		
	public static Integer[] ArayList (ArrayList<Integer>list)	{
		Integer []arr = {1000, 900, 80, 765, 123, 456};
		ArrayList<Integer> num = new ArrayList<>();
		num.addAll(Arrays.asList());
		
		return arr;
	}
	
	
	public static int Max (ArrayList<Integer>list)	{
		Integer max = Integer.MIN_VALUE;
		for (int each:list) {
			if(each>max) {
				max=each; 
			} 
		}
		return max;
	}
		
	public static int Min (ArrayList<Integer>list)	{	
		Integer min = Integer.MAX_VALUE;
		for (int each1:list) {
			if (each1 <min) {
				min = each1;
			}
		}
		return min;
		
	}

	public static int SecMax (ArrayList<Integer>list) {
		Integer max = Max(list);
		list.remove(max);
		int secMax= Max(list);
	
		return secMax;
	}
	
	public static int SecMin(ArrayList<Integer> list) {
		Integer Min = Min(list);
		list.remove(Min);
		int secMin = Min(list);
		
		return secMin;
	}
}
