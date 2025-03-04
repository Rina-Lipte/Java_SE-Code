package day_24_12;

public class PetrolPump 
{
	public synchronized void refillCar(String carName)
	{
		System.out.println(carName+" starting refilling... ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(carName+"completed refilling!");
	}

}
