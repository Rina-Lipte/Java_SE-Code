package day_17_12;

public class EducationInstituteApp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Course[] c= {new Course(1, "Math", 1000),new Course(2, "Science", 1200),new Course(3, "English", 900)};
		Offer[] f= {new Offer("Special discount: Get 20% off on all courses!"),new Offer("Limited time offer: Enroll in any two courses and get one course free!")};
		
		EducationInstitude ei=new EducationInstitude(c, f);
		
		Student s1=new Student("Virat", ei);
		Student s2=new Student("Dhoni",ei);
		
		Thread t1 = new Thread(()->{
			s1.viewCourseAndFees();
			s1.viewOffers();
			s1.enrollInCourse(1);
		});
		
		Thread t2 = new Thread(()->{
			s2.viewCourseAndFees();
			s2.viewOffers();
			s2.enrollInCourse(3);
		});
		t1.start();
		t1.join();
		System.out.println();
		t2.start();
		

	}

}
