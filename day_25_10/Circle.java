package day_25_10;

public class Circle 
{
	double radius;

	Circle()
	{
		radius=0.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	double getarea()
	{
		if(radius<0)
		{
			return -1;
		}
		return 3.14*radius*radius;
	}

}
