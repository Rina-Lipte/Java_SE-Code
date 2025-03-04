package day_19_11;

public class MainCourse {

	public static void main(String[] args) {
		Video v=new Video("abc", -45);
		Article a=new Article("abc", "xyz");
		Quiz q=new Quiz("abc", 5);
		
		CourseManager cm=new CourseManager();
		cm.processContent(v);
		cm.processContent(a);
		cm.processContent(q);
		
		cm.processMultipleContents(v,a,q);

	}

}
