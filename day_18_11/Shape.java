package day_18_11;

public class Shape 
{
	
	public Shape() {
		super();
		
	}

	public static Shape randshape()
	{
		switch((int) (Math.random()*3))
		{
		case 0: 
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		default: 
			System.out.println("Input field is not proper!!");
		
		
		}
		return new Shape();
	}
	
	void draw()
	{
		System.out.println("Shape Draw");
	}
	void erase()
	{
		System.out.println("Shape Erase");
	}

}
