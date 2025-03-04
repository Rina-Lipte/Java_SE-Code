package day_2_10;
import java.util.*;
public class Circle {
	public static String getArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		double radius=sc.nextDouble();
		if(radius<=0)
		{
			return ""+0;
		}
		else
		{
			final double pi=3.14;
			return ""+(pi*radius*radius);
		}
	}

}
