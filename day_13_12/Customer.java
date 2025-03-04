package day_13_12;



public class Customer implements Runnable
{
	private int availableSeat=1;
	private int wantedSeat;
	
	public Customer(int wantedSeat)
	{
		super();
		this.wantedSeat=wantedSeat;
	}
	
	

	@Override
	public synchronized void run() 
	{
		String name=null;
		
		if(availableSeat>=wantedSeat)
		{
			name=Thread.currentThread().getName();
			
			System.out.println(wantedSeat+" seat is reserved for "+name);
			
			availableSeat=availableSeat - wantedSeat;
		}
		else
		{
			name=Thread.currentThread().getName();
			System.err.println("Sorry!!"+name+" seat is not available");
		}
	}

	}
	


