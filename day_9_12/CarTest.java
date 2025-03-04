package day_9_12;

public class CarTest 
{
	public static void stop(String str) throws CarStoppedException
	{
		if(str.equalsIgnoreCase("stop"))
		{
			throw new CarStoppedException("Car stopped for some reason.");
		}
		else
		{
			System.out.println("Car not stalled.");
		}
	}
	
	public static void puncture(String str) throws CarPunctureException
	{
		if(str.equalsIgnoreCase("puncture"))
		{
			throw new CarPunctureException("Car is punctured.");
		}
		else
		{
			System.out.println("Car is not punctured");
		}
	}
	
	public static void carHeat(int num) throws CarHeatException
	{
		if(num>50)
		{
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		else
		{
			System.out.println("Car temperature normal.");
		}
	}

	

}
