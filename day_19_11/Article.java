package day_19_11;

public class Article extends CourseContent
{
	private String auther;

	public Article(String title, String auther) {
		super(title);
		this.auther = auther;
	}

	public String getAuther() {
		return auther;
	}
	
	
	

}
