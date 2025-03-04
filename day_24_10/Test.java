package day_24_10;

public class Test {

	public static void main(String[] args) {
		Car c=new Car("Yamaha", "MT-07", -2020, 4);
		System.out.println("Car Details:");
		c.displayDetails();
		
		Bike b=new Bike("Audi","Q8",2021,"Sport");
		System.out.println("\nBike Details:");
		b.displayDetails();
	}

}
