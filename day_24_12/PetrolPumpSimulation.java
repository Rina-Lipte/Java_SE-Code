package day_24_12;

public class PetrolPumpSimulation {

	public static void main(String[] args) 
	{
		PetrolPump pp=new PetrolPump();
	  Car[]cars= {new Car("Alto",pp),new Car("Hunadai",pp),new Car("Nano",pp)};
	Thread[]threads=new Thread[cars.length];	
//	Thread t1=new Thread(cars[0]);
//	Thread t2=new Thread(cars[1]);
//	Thread t3=new Thread(cars[2]);
	for(int i=0;i<cars.length;i++) {
		threads[i]=new Thread(cars[i]);
	}
	for(int i=0;i<cars.length;i++) {
		threads[i].start();
	}
//	t1.start();
//	t2.start();
//	t3.start();
	try {
		for(int i=0;i<cars.length;i++) {
			threads[i].join();
		}
	}catch(InterruptedException e) {
		
	}

	}

}
