package day_19_11;

public class Video extends CourseContent
{
	private int duration;

	public Video(String title, int duration) {
		super(title);
		
		this.duration = duration;
	}

	public int getDuration() {
		if(duration<0)
		{
			System.err.println("Invalid duration..");
		}
		else
		{
			return duration;
		}
		return 0;
	}
	
	
	

}
