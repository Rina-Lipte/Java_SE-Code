package day_18_11;

public class Triangle extends Shape
{
	public Triangle()
	{
		super();
	}

	@Override
	void draw() {
		System.out.println("Triangle Draw!");
	}

	@Override
	void erase() {
		System.out.println("Triangle Erase!");
	}
	

}
