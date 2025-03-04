package day_19_11;

public class CourseManager 
{
	public void processContent(CourseContent x)
	{
		if(x instanceof Video)
		{
			Video v=(Video)x;
			System.out.println("Processing Duration: "+v.getDuration());
		}
		else if(x instanceof Article)
		{
			Article a=(Article)x;
			System.out.println("Article Auther :"+a.getAuther());
		}
		else if(x instanceof Quiz)
		{
			Quiz q=(Quiz)x;
			System.out.println("Number of Questions :"+q.getNumberOfQuestions());
		}
		else
		{
			System.out.println("Processing other content.");
		}
	}
	public void processMultipleContents(CourseContent...contents )
	{
		for(CourseContent a:contents)
		{
			processContent(a);
		
		}
	}

}
