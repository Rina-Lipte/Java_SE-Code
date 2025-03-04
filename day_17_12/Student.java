package day_17_12;

public class Student 
{
	String name;
	EducationInstitude institude;
	
	public Student(String name, EducationInstitude institude) {
		super();
		this.name = name;
		this.institude = institude;
	}
	
	public void viewCourseAndFees()
	{
		Course[] course=institude.getCourse();
		System.out.println("Available Courses: ");
		System.out.println("ID\t\tName\t\t\tFee");
		for(Course course2:course)//Course course2=new Course(1, "Mathamatics", 1000)
		{
			System.out.println(course2.courseId+"\t\t"+course2.getCourseName()+"\t\t\t"+course2.getCourseFee());
		}
	
	}
	
	public void viewOffers()
	{
		Offer[] offers=institude.getOffers();
		System.out.println("Ongoing Offers: ");
		for(Offer offer1:offers)
		{
			System.out.println(offer1.getOfferText());
		}
		
	}
	
	public void enrollInCourse(int courseId)
	{
		institude.enrollStudentInCourse(courseId, name);
	}

	

}
