package day_16_10;

public class Rectangle 
{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width*height;
	}
	
	public double getPerimeter()
	{
		return (width+height)*2;
	}

	@Override
	public String toString() {
		if(width<=0 || height<=0)
		{
			return "Width and height must be non-negative.";
		}
		else
		{
		return "Rectangle [width=" + width + ", height=" + height + "]";
		}
		}
	
	
	
	

}
