package Test;

public class AreaPerimeterRectangle {

	public double getArea(double length, double breadth) {
		double Area = length * breadth;
		return Area;
	}
	
	public double getPerimeter(double length, double breadth) {
		double Perimeter = 2* (length+breadth);
		return Perimeter;
	}
	
	public static void main(String[] args) {

		AreaPerimeterRectangle areaPeri = new AreaPerimeterRectangle();
		System.out.println("Area of a rectangle is : " + areaPeri.getArea(5.5, 8.5));
		System.out.println("Perimeter of a rectangle is : " + areaPeri.getPerimeter(5.5, 8.5));
		
	}

}
