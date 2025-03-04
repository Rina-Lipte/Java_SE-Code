package day_2_10;
import java.util.*;
public class Student {
	public static String getStudentDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the Stu Roll nu: ");
		int rollnu=sc.nextInt();
		System.out.printf("Enter the name of stu: ");
		String name=sc.next();
		System.out.printf("Enter the stu fees: ");
		double fees=sc.nextDouble();
		return "[ Roll is :"+rollnu+", "+"Name is :"+name+", "+"Fees is :"+fees+"]";
		
		
	}

}
