package day_24_10;

public class Vechicle 
{
	String make;
	String model;
	int year;
	
	
	public Vechicle(String make, String model, int year) {
		super();
		if(year<=0)
		{
			System.err.println("Error invalid input");
			return;
		}
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	void displayDetails()
	{
		
		System.out.println("make:"+make);
		System.out.println("Model: "+model);
		System.out.println("Year :"+year);
	}
	
	

}
