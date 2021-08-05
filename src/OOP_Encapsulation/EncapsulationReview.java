package OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

class credentials {
	
	private String UserName;
	private String passWord;
	
	public credentials () {
		setUserName("Admin"); 
		setpassWord("12345");
	}
	//getter: 
	public String getUserName() {
		return UserName;
	}
	
	public String getpassWord() { 
		return passWord;
	}
	
	//setter:
	public void setUserName (String UserName) {
		this.UserName = UserName;
	}
	
	public void setpassWord (String passWord) {
		this.passWord = passWord;
	}
	
	public void setcredentials ( String UserName, String passWord) {
		// this.UserName = UserName;
		// this.passWord = passWord;
		setUserName(UserName);
		setpassWord(passWord);
	}	
	
	public void getInfo() {
		System.out.println("username: "+getUserName());
		System.out.println("password: "+getpassWord());
			
	}
	 
}

public class EncapsulationReview {

	public static void main(String[] args) {
		credentials obj = new credentials();
				//	obj.UserName = "Dake";
				//	obj.passWord = "12345";
		
		obj.setcredentials("Daul", "1111");
					
		System.out.println(obj.getUserName());
		System.out.println(obj.getpassWord());
		
		credentials Nurzat = new credentials();
					Nurzat.setUserName("Dake");
					Nurzat.setpassWord("987654");
		System.out.println(Nurzat.getUserName());
		System.out.println(Nurzat.getpassWord());
		
		credentials Daulet = new credentials();
		Daulet.setcredentials("Dauka", "456");
		
		System.out.println("UserName: "+ Daulet.getUserName());
		System.out.println("passWord: "+Daulet.getpassWord());
		
		Nurzat.getInfo();
		System.out.println("___________________________________________________________");
		
		credentials[] users = {obj, Nurzat, Daulet};
		users[0].getInfo();
		users[1].getInfo(); 
		users[2].getInfo(); 
		
		System.out.println("___________________________________________________________");

		
		ArrayList<credentials> CredentialsList = new ArrayList<>();
		CredentialsList.addAll(Arrays.asList(obj, Nurzat, Daulet));  
			CredentialsList.get(0).getInfo();
			
		System.out.println("----------------------------------------------------------------");
			for(credentials each: CredentialsList) {
				each.getInfo();
			}
		
		
	}
}
