package day_21_11;

public class Triangle extends Shape
{
	double base;
	double height;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	double getArea() {
		
		return (0.5*base*height);
	}
	@Override
	double printDetails() {
		
		return getArea();
	}
	

}
