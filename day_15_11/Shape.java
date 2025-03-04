package day_15_11;

public class Shape {
	
	public double calculateVolume(double sideLength)
	{
		if(sideLength<0)
		{
			System.out.println("Error: Side length cannot be negative.");
		}
		else
		{
		return sideLength*sideLength*sideLength;
		}
		return 0.0;
	}
	public double calculateVolume(double radius,double height)
	{
		return 3.14*radius*radius*height;
	}
	public double calculateVolume( float pi,double radius)
	{
		return (4/3*pi*radius*radius);
	}

}
