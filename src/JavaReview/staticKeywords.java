  package JavaReview;

public class staticKeywords {

	
	 public String InsName = "Apple";
	 public static String StaName = "Peaches";
	
	public static void printName() {
	
		//System.out.println(InsName); 	// static accepts only static
		System.out.println(StaName);	// static accepts only static
	
	}

	public void printName2() {  
		System.out.println(InsName);
		System.out.println(StaName); 	// class members are always accepted
	} 
}
 