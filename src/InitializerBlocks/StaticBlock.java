 package InitializerBlocks;

public class StaticBlock {
	
	
	public StaticBlock() { 
		System.out.println("This is constructor");
	}
	
	public static void main(String[] args) {
		
		StaticBlock	obj1 = new StaticBlock();
		StaticBlock	obj2 = new StaticBlock();
		StaticBlock	obj3 = new StaticBlock();
		StaticBlock	obj4 = new StaticBlock();
		StaticBlock	obj5 = new StaticBlock();
		
		System.out.println("Main method  ");
		
	}
	
	static {
		System.out.println("static block 1");
	//	System.out.println("static block B  ");
	}
	
	static {
		System.out.println("static block 2");
	}
}
