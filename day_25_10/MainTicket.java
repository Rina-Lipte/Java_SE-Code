package day_25_10;

public class MainTicket {

	public static void main(String[] args) {
		Ticket t=new Ticket("Concert", 101, 50.0);
		System.out.println("Regular Ticket: ");
		System.out.println("Event :"+t.getEventName());
		System.out.println("Seat number: "+t.getSeatNumber());
		System.out.println("Price :"+t.getPrice());
		
		
		VIPTicket vt = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
	    System.out.println("\nVIP Ticket: ");
	    System.out.println("Event :"+vt.getEventName());
	    System.out.println("Seat Number: "+vt.getSeatNumber());
	    System.out.println("Price : "+vt.getPrice());
	    System.out.println("Special Access: "+vt.getSpecialAccess());
	
		 StudentTicket st = new StudentTicket("Student Event", 301, 30.0, true);
		 System.out.println("\nStudent Ticket :");
		 System.out.println("Event: "+st.getEventName());
		 System.out.println("Seat number: "+st.getSeatNumber());
		 System.out.println("Price :"+st.getPrice());
		 System.out.println("Student Discount: "+st.isStudentDiscount());
	
	}

}
