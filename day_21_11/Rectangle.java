package day_21_11;

public class Rectangle extends Shape
{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double getArea() {
		
		return length*breadth;
	}

	@Override
	double printDetails() {
		
		return getArea();
	}
	

}
