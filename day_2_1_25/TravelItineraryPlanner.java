package day_2_1_25;

public class TravelItineraryPlanner {

	public static void main(String[] args) 
	{
		Activity a=new Activity("Visit Eiffel Tower", "Morning");
		Destination d=new Destination("Paris");
		Destination d1=new Destination("London");
		ItineraryPlanner i=new ItineraryPlanner();
		d.addActivity(a);
       d1.addActivity(a);
       i.addDestination(d);
		i.addDestination(d1);
		i.retrive();
		

	}

}
