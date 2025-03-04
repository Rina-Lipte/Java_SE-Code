package day_13_12;

public class RailwayReservation 
{

	public static void main(String[] args) 
	{
		Customer c1=new Customer(1);
		
		Thread t1=new Thread(c1,"Scott");
		Thread t2=new Thread(c1,"smith");
		
		t1.start();
		t2.start();

	}

}
