package day_24_10;

public class Bike extends Vechicle
{
	String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}

	@Override
	void displayDetails() {
		if (year >0)
		{
		super.displayDetails();
		System.out.println("Type :"+type);
		}
	}
	
	

}
