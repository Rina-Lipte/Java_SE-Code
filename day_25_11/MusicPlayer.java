package day_25_11;

public class MusicPlayer implements AdvancedmediaPlayer 
{
	String title;
	

	public MusicPlayer(String title) {
		
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
		System.out.println("Playing music : "+title);
		
	}

	@Override
	public void stop() {
		if (title != null) 
		System.out.println("Stopping music: "+title);
		
	}

	@Override
	public void pause() {
		if (title != null) 
		System.out.println("Pausing music :"+title);
		
	}

}
