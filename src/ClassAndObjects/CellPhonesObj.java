package ClassAndObjects;

public class CellPhonesObj {
	public static void main(String[] args) {
		
	
	
	CellPhones phone = new CellPhones();
	System.out.println(phone.brand);
	System.out.println(phone.color);
	System.out.println(phone.screensize);
	System.out.println(phone.price);
	System.out.println(phone.model);
	
	phone.call(8328179122l);
	phone.SendMessage(8328179122l);
	
	CellPhones phone2 = new CellPhones("Samsung", "S21", 10.5, "Black", 700);
			phone2.getInfo();
	
	CellPhones phone3 = new CellPhones("Nokia", "8100", 8.5, "White", 350);
			phone3.getInfo();   
	
	CellPhones phone4 = new CellPhones("LG", "Android", 9.5, "Blue", 451) ;
			phone4.getInfo(); 
	
			CellPhones[] phones = {phone, phone2, phone3, phone4};
			
			//brand of phone3:
			System.out.println(phones[2].brand);
			//getInfo of phone3
			phones[2].getInfo();
			
			
			
	}
}
