package day_25_10;

public class Cylinder extends Circle
{
	double height;
	
	Cylinder()
	{
		height=0.0;
	}

	
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	double getVolume()
	{
		if(height<0)
		{
			return -1;
		}
		return 3.14*radius*radius*height;
	}

}
