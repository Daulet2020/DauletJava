package OOP_Encapsulation;

public class TestData {
	
	/*
	 Name 
	 ID
	 */

	private String Name = "Daulet";      // the data is not visible to any other classes
	private int ID = 897;
	
	//getter
	public String getName() {			// read the private data only
		return Name;
	}
	
	public int getID() {			// read the private data only
		return ID;
	}
	
	//setter: to change value
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setID (int ID) {
		this.ID = ID;
	}
} 
