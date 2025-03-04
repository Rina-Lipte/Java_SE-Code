package day_18_11;

public class Circle extends Shape
{
	
	public Circle()
	{
		super();
	}

	@Override
	void draw() {
		System.out.println("Circle Draw!");
	}

	@Override
	void erase() {
		System.out.println("Circle Erase!");
	}
	

}
