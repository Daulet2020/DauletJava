package InitializerBlocks;


public class InstancePractice {
	 
	public String name = "Daulet";
	
	public InstancePractice(){
		this(11);
		name = "Dinara";
	}
	
	{
		name = "Sergei";
	}
	
	{
		name = "Hatice";
	}
	
	public InstancePractice(int a) {
		name  = "Muhtar";
	}
	
	public static void main(String[] args) {
		
		InstancePractice obj = new InstancePractice();
		obj.name = "Viktor";
		System.out.println(obj.name);
	
		InstancePractice obj2 = new InstancePractice();
		System.out.println(obj2.name);
		
		
	
	}
	
	

}
