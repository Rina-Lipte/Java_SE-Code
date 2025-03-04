package day_21_11;

public abstract class Car 
{
	String brand;
	String model;
	int mileage;
	int top_speed;
	int yearOfManufacturing;
	
	public Car()
	{
		super();
	}

	String carBrand()
	{
		brand="BMW";
		return brand;
	}
	
	String carModel()
	{
		model="a3";
		return model;
		
	}
	
	int carMileage()
	{
		mileage=60;
		return mileage;
	}
	
	int carTopSpeed()
	{
		top_speed=80;
		return top_speed; 
	}
	
	int carYear()
	{
		yearOfManufacturing=1;
		return yearOfManufacturing;
	}
	abstract void display();
	
}
