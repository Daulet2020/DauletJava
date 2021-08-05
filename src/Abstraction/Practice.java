package Abstraction;

abstract class shape {
	
	public abstract void Area();
	public static void main(String[] args) {
		
}
	
abstract class T extends shape{
	public void Area() {
		System.out.println("Area of the T is ...");
	}
}
}

// concrete
class triangle extends shape{

	public void Area() {
		System.out.println("Area of the trianlge is ...");
	}
}

public class Practice {
	public static void main(String[] args) {
		triangle a = new triangle();
		a.Area();
		
	}

}
