package Jan30;

import java.util.List;

record Student(String name,String course)
{
	
}
public class StudentFilter {

	public static void main(String[] args) 
	{
		List<Student> stu=List.of(new Student("Alice","Java"),new Student("Bob","Python"),new Student("Charlie","Java"),new Student("David","C++"),new Student("Eve","JavaScript"));
		
		stu.stream().filter(stu1->stu1.course().equalsIgnoreCase("Java")).forEach(stu2->System.out.println(stu2.name()));
		

	}

}
