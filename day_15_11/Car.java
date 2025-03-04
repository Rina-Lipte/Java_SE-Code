package day_15_11;

public class Car extends Vehicle{

	public Car(double totalDistance, double totalFuelConsumed) {
		super(totalDistance, totalFuelConsumed);
		
	}

	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		double result= super.calculateFuelEfficiency();
		return result*2.35215;
	}

	

	
	
	
	

}
