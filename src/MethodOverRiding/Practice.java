package MethodOverRiding;


class WebDriver {
	public void get() {
		System.out.println("Open browser");
	}
	
}

class chromeDriver extends WebDriver {
	@Override 
	public void get() {
		System.out.println("chrome browser opened");
	}
	
}

class FireFoxDriver extends WebDriver {
	@Override 
	public void get() {
		System.out.println("FireFox browser opened");
	}
	
}

public class Practice {

	public static void main(String[] args) {
		chromeDriver driver1 = new chromeDriver();
		driver1.get();
		
		FireFoxDriver driver2 = new FireFoxDriver(); 
		driver2.get();
			
		final int num;
		num = 100;
	//	num = 200;     // final can not be reassign
		
		final String DoB = "04/29/1977";
		
		
	}
}

final class Encaps extends Practice {
	
	private final String passWord = "Astana";
	private final String Login = "Daulet";
	
	public String getpassWord() {
		return passWord;
	}
	
	/*    NOT POSSIBLE coz it is final
	 
	public void setpassWord (String passWord) {
		this.passWord;
	}
	*/
	
}



