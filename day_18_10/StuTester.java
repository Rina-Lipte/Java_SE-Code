package day_18_10;

public class StuTester {

	public static void main(String[] args) {
		Student s1=new Student("xyz",101,"abc",40000);
		s1.setAverage(90);
		System.out.println(s1);
		System.out.println("Grade: "+s1.calculateGrade());

		Student obj=new Student();
		System.out.println(obj);
	}

}