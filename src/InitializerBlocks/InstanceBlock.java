 package InitializerBlocks;

public class InstanceBlock {
	
	{
		System.out.println("instance block 1");
	}
	
	{
		System.out.println("instance block 2");
	}
	
	{
		System.out.println("instance block 3");
	}
	
	public InstanceBlock() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		InstanceBlock obj = new InstanceBlock();
	  	InstanceBlock obj1 = new InstanceBlock();
	//	InstanceBlock obj2  = new InstanceBlock();
	}

}
