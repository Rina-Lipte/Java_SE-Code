package day_12_11;

public class FuelTank {
	private double fuelLevel;
	private final double maxCapacity;
	
	public FuelTank(double fuelLevel, double maxCapacity) {
		super();
		this.fuelLevel = fuelLevel;
		this.maxCapacity = maxCapacity;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}
	
	public void refillFuel(double amount)
	{
		if (fuelLevel < maxCapacity &&  amount< maxCapacity) {
            fuelLevel += amount;
            System.out.println("Fuel refilled. Current fuel level: " + fuelLevel + " liters");
        } else {
            System.out.println("Cannot refill. Tank capacity exceeded.");
        }
    }
		
	}


