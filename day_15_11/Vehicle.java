package day_15_11;

public class Vehicle {
	private double totalDistance;
	private double totalFuelConsumed;
	public Vehicle(double totalDistance, double totalFuelConsumed) {
		super();
		
		this.totalDistance = totalDistance;
		this.totalFuelConsumed = totalFuelConsumed;
	}
	
	public double calculateFuelEfficiency()
	{
		if(totalFuelConsumed==0)
		{
			System.err.println("Error: Fuel consumed cannot be zero.");
		}
		else
		{
			return totalDistance/totalFuelConsumed;
		}
		return -1;
	}
	
	public double calculateFuelEfficiency(double distanceInMiles,double distanceInGallons)
	{
		if(distanceInGallons==0)
		{
			System.err.println("Error: Fuel consumed cannot be zero.");
		}
		else
		{
		return (distanceInMiles/distanceInGallons)*2.35215;
		}
		return -1;
	}
}
