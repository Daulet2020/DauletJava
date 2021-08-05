package OOP_Inheritance;

class TestBase {
	
	static String chromeDriver = "Chrome"; 		// default
	
	public static void TakeScreenShot () {
		 System.out.println("Took screenshot");
	}
	
	 private static void closeBrowser () {
		 System.out.println("Browser closed");
	 }
}
	
public class Inheritance extends TestBase {
				// sub				//super
	public static void main(String[] args) {
		
		System.out.println(chromeDriver);
		TakeScreenShot();
		
		
	}

}
