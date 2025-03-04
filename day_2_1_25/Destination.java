package day_2_1_25;

import java.util.ArrayList;

public class Destination 
{
   private String  name;
	private ArrayList<Activity> activites;
	
	
	
	public Destination(String name)
	{
		this.name=name;
		this.activites=new ArrayList<Activity>();
	}
	
	public void addActivity(Activity e)
	{
		activites.add(e);
	}

	@Override
	public String toString() {
		return "Destination [name=" + name + ", activites=" + activites + "]";
	}
	

}
