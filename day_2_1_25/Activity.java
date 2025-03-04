package day_2_1_25;

public class Activity 
{
	private String name;
	private String schedule;
	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public String getSchedule() {
		return schedule;
	}
	@Override
	public String toString() {
		return "Activity [name=" + name + ", schedule=" + schedule + "]";
	}
	
	

}
