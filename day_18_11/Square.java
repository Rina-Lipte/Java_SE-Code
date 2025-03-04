package day_18_11;

public class Square extends Shape
{
	public Square()
	{
		super();
	}

	@Override
	void draw() {
		System.out.println("Square Draw!");
	}

	@Override
	void erase() {
		System.out.println("Square erase!");
	}
	
	

}
