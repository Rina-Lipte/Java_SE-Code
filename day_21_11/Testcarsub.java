package day_21_11;

public class Testcarsub extends Car
{
	public static void main(String[] args)
	{
		Testcarsub t=new Testcarsub();
		t.display();
	}
	

	@Override
	void display() {
		System.out.println("Car brand: "+carBrand());
		System.out.println("Car Model: "+carModel());
		System.out.println("Car Mileage :"+carMileage());
		System.out.println("Car Top speed :"+carTopSpeed());
		System.out.println("Car Year of Manufacturing :"+carYear());
		
	}
	

}
