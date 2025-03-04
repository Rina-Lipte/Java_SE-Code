package day_24_10;

public class Car extends Vechicle
{
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		if(numberOfDoors<0)
		{
			System.err.println("Invalid Input");
			
		}
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	void displayDetails() 
	{
		if(year>0 && numberOfDoors>0)
		{
			
		super.displayDetails();
		System.out.println("Number of Doors"+numberOfDoors);
		}
	}
	
	

}
