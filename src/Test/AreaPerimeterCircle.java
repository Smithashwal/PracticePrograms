package Test;

public class AreaPerimeterCircle {
	
	public double getPerimeter(double r) {
		double Perimeter = 2 * Math.PI * r;
		return Perimeter;
	}

	public double getArea(double r) {
		double Area= Math.PI * r * r;
		return Area;
	}
	
	public static void main(String[] args) {
		AreaPerimeterCircle areaPeri = new AreaPerimeterCircle();
		
		System.out.println("Perimeter of a circle is : " + areaPeri.getPerimeter(7.5));
		
		System.out.println("Area of a circle is : " + areaPeri.getArea(7.5));
	}

}
