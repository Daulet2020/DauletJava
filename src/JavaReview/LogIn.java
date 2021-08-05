package JavaReview;

public class LogIn {
	
	public static void main(String[] args) {
		
		LogIn_Credentials obj = new LogIn_Credentials();
		
		//read:
			System.out.println(obj.getUsername());
			System.out.println(obj.getPassword ());
		
		//modify:
		obj.setUsername("Madina");
		obj.setPassword("2030");
		
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword ());
		
		
	}

}
