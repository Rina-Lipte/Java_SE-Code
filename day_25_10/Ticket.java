package day_25_10;

public class Ticket 
{
	private String eventName;
	private int seatNumber;
	private double price;
	
	public Ticket(String eventName, int seatNumber, double price) {
		super();
		if(seatNumber<=0 || price<=0)
		{
			System.err.println("Invalid input");
		}
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
