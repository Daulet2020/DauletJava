package Shape;

public class Shape {
	
	protected void Area() {
		System.out.println("Area is 0");
	}
	
	protected void perimeter () {
		System.out.println("perimeter is 0");
	}
	
	protected void capacity    () {
		System.out.println("volume is 0");
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5);
				rectangle.Area();
				Rectangle rectangle1 = new Rectangle(20, 5);
				rectangle1.perimeter();	
					
		Square square = new Square(15);
				square.Area();
				Square square1 = new Square(15);
				square.perimeter();
		
		Circle circle = new Circle(5);
				circle.Area();
				Circle circle1 = new Circle(6);
				circle1.perimeter();
				
		Cylinder cylinder1 = new Cylinder(5, 10);
				 cylinder1.Area();
				 cylinder1.perimeter();
				 cylinder1.capacity();
				 
		
		
		
	}
}
