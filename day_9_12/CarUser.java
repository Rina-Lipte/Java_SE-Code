package day_9_12;

public class CarUser {

	public static void main(String[] args) 
	{
		try 
		{
			CarTest.stop("stop");
		} 
		catch (CarStoppedException e) 
		{
			System.out.println(e);
		}
		
		try 
		{
			CarTest.puncture("puncture");
		} 
		catch (CarPunctureException e) 
		{	
			System.out.println(e);
		}
		
		try {
			CarTest.carHeat(60);
		} 
		catch (CarHeatException e) 
		{
			
			System.out.println(e);
		}
		

	}

}
