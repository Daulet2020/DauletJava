package Shape;

public class Cylinder extends Shape {
	double radius;
	double height;
	final double PI = 3.14;
	double diameter;
	
	public Cylinder(  double radius, double height) {
		this.radius = radius;
		this.height = height;
		diameter = radius*2;
	}
	@Override
	protected void Area() {
		double Area = (PI*diameter*radius)+(height*PI*diameter);
		System.out.println("Area of the cylinder is "+Area);
		
	}
	@Override
	protected void perimeter() {
		double perimeter = 2*(PI*diameter*height);
		System.out.println("Peromiter of the cylinder is "+perimeter);
		
	} 
	
	

}
