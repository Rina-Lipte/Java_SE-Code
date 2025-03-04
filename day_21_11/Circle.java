package day_21_11;

public class Circle extends Shape
{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double getArea() {
		
		return 3.14*radius*radius;
	}

	@Override
	double printDetails() {
		
		return getArea();
	}
	
	

}
