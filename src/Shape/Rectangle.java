package Shape;

public class Rectangle extends Shape {
	double length;
	double width;
	
	public Rectangle(double lenth, double width) {
		this.length=lenth;
		this.width=width;
		
	}
	
	@Override
	protected void Area () {
		double Area = length*width;
		System.out.println("Area is "+Area);
	}
	@Override
	protected void perimeter () {
		double perimeter = length+width;
		System.out.println("Perimeter is "+perimeter);
	}
	
	

}
