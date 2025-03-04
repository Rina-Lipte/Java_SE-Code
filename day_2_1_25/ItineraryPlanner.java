package day_2_1_25;

import java.util.ArrayList;

public class ItineraryPlanner 
{
	ArrayList<Destination> list=new ArrayList<>();
	
	public void addDestination(Destination d)
	{
		list.add(d);
	}
	public void retrive()
	{
		for (Destination destination : list) {
			System.out.println(destination);
		}
	}

}
