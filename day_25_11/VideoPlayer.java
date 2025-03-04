package day_25_11;

public class VideoPlayer implements AdvancedmediaPlayer 
{
	String title;
	

	public VideoPlayer(String title) {
		if( title.isEmpty())
		{
			System.err.println("Title is not be empty string.");
			return;
		}
		else
		{
		this.title = title;
		}
	}

	@Override
	public void play() {
		if (title != null)
		System.out.println("Playing Video :"+title);
		
	}

	@Override
	public void stop() {
		if (title != null)
		System.out.println("Stoping video :"+title);
		
	}

	@Override
	public void pause() {
		if (title != null)
		System.out.println("Pausing Video :"+title);
		
	}

}
