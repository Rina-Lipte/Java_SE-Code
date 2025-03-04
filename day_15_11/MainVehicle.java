package day_15_11;

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle v=new Vehicle(500, 0);
		if(v.calculateFuelEfficiency()!=-1)
		{
			System.out.println("Fuel Efficiency (km/l) :"+v.calculateFuelEfficiency());
			
			System.out.println("Fuel Efficiency (miles/gallon): "+v.calculateFuelEfficiency(500, 0));
		}
		
		
		
		Car c= new Car(500, 50);
	
		System.out.println("Car Fuel Efficiency (miles/gallon): "+c.calculateFuelEfficiency(500,0));

	}

}
