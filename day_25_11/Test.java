package day_25_11;

public class Test 
{
	public static void main(String []args) {
		MusicPlayer m=new MusicPlayer("Life");
		m.play(); m.stop(); m.pause();
		
		VideoPlayer v=new VideoPlayer("");
		v.play(); v.stop(); v.pause();
	}
	

}
