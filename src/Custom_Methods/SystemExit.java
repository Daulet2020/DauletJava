package Custom_Methods;

public class SystemExit {
	public static void main(String[] args) {
		
		System.out.println(number());
		System.out.println("Done");
		
		}
	
	public static void method () {
		System.out.println("Hello world");
		System.exit(0);
	}

	public static int number() {
		if (true) {
			System.exit(0);    // exits all the java execution
		}
		
		return 5;
	}
	
	
	
	}

	

