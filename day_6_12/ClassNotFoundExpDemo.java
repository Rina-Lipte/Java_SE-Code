package day_6_12;

import java.util.Scanner;

public class ClassNotFoundExpDemo 
{

	public ClassNotFoundExpDemo(String ClassNotFoundExpDemo)
	{
		ClassNotFoundExpDemo a;
		try
		{
			System.out.println("Class Found: "+Class.forName(ClassNotFoundExpDemo));
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a class name to load: ");
		String str=sc.nextLine();
		
		ClassNotFoundExpDemo c=new ClassNotFoundExpDemo(str);
		sc.close();
	}

}
