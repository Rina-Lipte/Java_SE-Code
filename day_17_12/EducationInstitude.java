package day_17_12;

public class EducationInstitude 
{
	Course[] course;
	Offer[] offers;
	
	public EducationInstitude(Course[] course, Offer[] offers) {
		super();
		this.course = course;
		this.offers = offers;
	}

	public Course[] getCourse() {
		return course;
	}

	public Offer[] getOffers() {
		return offers;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName)
	{
	    	
		for(Course course2:course)
		{
			if(course2.getCourseId()==courseId)
			{
				System.out.println(studentName+" has enrolled in the course: "+course2.getCourseName());
			}
			
		}
		
	}
	
	

}
