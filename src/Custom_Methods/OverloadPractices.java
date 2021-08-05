package Custom_Methods;

public class OverloadPractices {
	
	public static void main(String[] kfc) {
	
		System.out.println("String Array");
		
		boolean [] array1 = {false, true};
		main(array1);
		
		double [] array2= {1,2,3};
		main(array2);
		
	}

	public static void main(int[] a) {
		System.out.println("Int Array");
		
	}
	
	public static void main(double[] b) {
		System.out.println("Double array");
		
	}
	 public static void main(boolean[] c) {
		System.out.println("Boolean Array");
		
	}
	
	
}
